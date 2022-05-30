package com.xxx;


import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author zquan
 * @date 2022/5/28
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        Iterator<Log> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            Log log = iterator.next();
            log.log("JDK SPI");
        }
    }
}
