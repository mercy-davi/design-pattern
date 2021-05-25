package com.davi.pattern.proxy.dynamicproxy.customproxy;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 用来生成源代码的工具类
 *
 * @Date 2021/5/20 23:11
 * @Created by hdw
 */
public class CustomProxy {
    public static final String line = "\r\n";

    public static Object newProxyInstance(CustomClassLoader loader,
                                          Class<?>[] interfaces,
                                          CustomInvocationHandler h)
            throws IllegalArgumentException {
        try {
            // 1、动态生成源代码
            String src = generateSrc(interfaces);

            // 2、Java文件输出磁盘
            String filePath = CustomProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(src);
            fw.flush();
            fw.close();

            JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardFileManager = systemJavaCompiler
                    .getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = standardFileManager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = systemJavaCompiler
                    .getTask(null, standardFileManager, null, null, null, null);
            task.call();
            standardFileManager.close();

            Class<?> proxyClass = loader.findClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(CustomInvocationHandler.class);

            return constructor.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        // 用代码写代码
        StringBuilder sb = new StringBuilder();
        sb.append("package com.davi.pattern.proxy.dynamicproxy.customproxy;" + line);
        sb.append("import com.davi.pattern.proxy.Person;" + line);
        sb.append("import java.lang.reflect.*;" + line);
        sb.append("public class $Proxy0 implements ").append(interfaces[0].getName()).append("{").append(line);

        sb.append("CustomInvocationHandler h;" + line);
        sb.append("public $Proxy0(CustomInvocationHandler h) {" + line);
        sb.append("this.h = h;" + line);
        sb.append("}" + line);

        for (Method method : interfaces[0].getMethods()) {
            sb.append("public ").append(method.getReturnType().getName()).append(" ").append(method.getName()).append("() {").append(line);
            sb.append("try {" + line);
            sb.append("Method m = ").append(interfaces[0].getName()).append(".class.getMethod(\"").append(method.getName()).append("\", new Class[]{});").append(line);
            sb.append("this.h.invoke(this, m, null);" + line);
            sb.append("} catch (Throwable e) {" + line);
            sb.append("e.printStackTrace();" + line);
            sb.append("}" + line);
            sb.append("}");
        }


        sb.append("}");
        return sb.toString();
    }
}
