package com.JinCheng;

import javafx.beans.binding.DoubleExpression;

import java.sql.*;

/**
 * a fast program of JDBC
 * query all records in Table account of Databaes fx_db
 * select * from account;
 * @author Jin
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 注册数据库驱动   register database driver
        Class.forName("com.mysql.cj.jdbc.Driver"); //把包（mysql Driver）交给JDBC Driver Manager（驱动管理器）来管理
        // 2. 获取数据库连接   get database connection
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/fx_db?characterEncoding=utf8&serverTimezone=UTC&useSSL=false", //参数之间用&连接
                //"jdbc:mysql:///fx_db",老的版本也可以；
                "root",
                "root");
        System.out.println("Database connected successfully！");
        // 3. 获取传输器      get transporter
        Statement stat = conn.createStatement();
        // 4. 通过传输器发送sql到数据库执行 send sql to database for executing
        ResultSet rs = stat.executeQuery("select * from account");
        System.out.println("sql info send！\n" + rs);
        // 5. 处理结果，打印到控制台 process result, print result in console
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("money");
            System.out.println(id + ", " + name + ", " + money);
        }
        // 6. 释放资源,越晚获取越先关闭       release resource
        rs.close();
        stat.close();
        conn.close();
    }
}
