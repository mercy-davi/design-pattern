package com.davi.pattern.proxy.dynamicproxy.customproxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;

/**
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
        } catch (Exception e) {

        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        // 用代码写代码
        StringBuffer sb = new StringBuffer();
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
