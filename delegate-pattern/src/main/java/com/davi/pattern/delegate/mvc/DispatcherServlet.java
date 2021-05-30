package com.davi.pattern.delegate.mvc;

import com.davi.pattern.delegate.mvc.controllers.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2021/5/30 21:02
 * @Created by hdw
 */
public class DispatcherServlet extends HttpServlet {
    private List<Handler> handlerMapping = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        try {
            Class<?> memberControllerClass = MemberController.class;
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById", String.class))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 完成调度
        doDispatcher(req, resp);
    }

    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) {
        String uri = req.getRequestURI();
        Handler handler = null;
        for (Handler h : handlerMapping) {
            if (uri.equals(h.getUrl())) {
                handler = h;
                break;
            }
        }
        try {
            if (handler != null) {
                Object obj = handler.getMethod().invoke(handler.getController(), req.getParameter("mid"));
                resp.getWriter().write(obj.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String uri = req.getRequestURI();
//        String id = req.getParameter("id");
//
//        if ("getMemberById".equals(uri)) {
//            new MemberController().getMemberById(id);
//        } else if ("getOrderById".equals(uri)) {
//            new OrderController().getOrderById(id);
//        } else if ("logout".equals(uri)) {
//            new SystemController().logout();
//        } else {
//            resp.getWriter().write("404 Not Found!");
//        }
//    }

    class Handler {
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
