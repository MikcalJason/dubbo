package com.xxx.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author zquan
 * @date 2022/5/29
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/xxl_job", "root", "123456");
        Connection root1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/xxl_job", "root", "123456");
    }


}
