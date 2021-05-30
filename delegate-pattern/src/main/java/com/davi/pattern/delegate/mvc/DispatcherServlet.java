package com.davi.pattern.delegate.mvc;

import com.davi.pattern.delegate.mvc.controllers.MemberController;
import com.davi.pattern.delegate.mvc.controllers.OrderController;
import com.davi.pattern.delegate.mvc.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date 2021/5/30 21:02
 * @Created by hdw
 */
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 完成调度
        doDispatcher(req, resp);
    }

    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String id = req.getParameter("id");

        if ("getMemberById".equals(uri)) {
            new MemberController().getMemberById(id);
        } else if ("getOrderById".equals(uri)) {
            new OrderController().getOrderById(id);
        } else if ("logout".equals(uri)) {
            new SystemController().logout();
        } else {
            resp.getWriter().write("404 Not Found!");
        }
    }
}
