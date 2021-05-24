package com.davi.pattern.proxy.dynamicproxy.customproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @Date 2021/5/20 23:12
 * @Created by hdw
 */
public class CustomClassLoader extends ClassLoader {

    private File classPathFile;

    public CustomClassLoader() {
        String classPath = CustomClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = CustomClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            // 根据类路径将.java文件找到并转换为.class文件
            File classFile = new File(classPathFile, name.replace("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len = in.read(buffer)) != -1) {
                        out.write(buffer, 0 , len);
                    }
                    return defineClass(className, out.toByteArray(), 0 , out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
