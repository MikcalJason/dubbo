package com.xxx.impl;

import com.xxx.Log;

/**
 * @author zquan
 * @date 2022/5/28
 */
public class Logback implements Log {
    @Override
    public void log(String info) {
        System.out.println("Logback:" + info);
    }
}
