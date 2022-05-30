package com.xxx;

import com.xxx.impl.Log4j;

/**
 * @author zquan
 * @date 2022/5/29
 */
public class TCCC {
    public static void main(String[] args) throws Exception {
        ClassLoader loader = TCCC.class.getClassLoader();
        System.out.println(loader);
        ClassLoader loader2 = Thread.currentThread().getContextClassLoader();
        System.out.println(loader2);
        Thread.currentThread().setContextClassLoader(new FileSystemClassLoader("G:\\zquan\\dubbo\\demo-log2\\target\\classes"));
        System.out.println(Thread.currentThread().getContextClassLoader());
        Class<Log4j> c = (Class<Log4j>) Thread.currentThread().getContextClassLoader().loadClass("com.xxx.impl.Log4j");
        System.out.println(c);
        System.out.println(c.getClassLoader());
    }
}
