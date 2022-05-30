package com.xxx.impl;

import com.xxx.Log;

/**
 * @author zquan
 * @date 2022/5/28
 */
public class Log4j implements Log {
    @Override
    public void log(String info) {
        System.out.println("Log4j:" + info);
    }
}
