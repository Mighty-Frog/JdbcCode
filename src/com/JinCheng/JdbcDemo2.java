package com.JinCheng;

import org.junit.Test;

import java.sql.*;

public class JdbcDemo2 {

    /*
    新增表记录：往account表中添加一条记录：null “Hellen” 3500
     */
    @Test
    public void testAdd() throws Exception {
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            Connection cnn = DriverManager.getConnection(
                    "jdbc:mysql:///fx_db?characterEncoding=utf-8&serverTimezone=UTC&useSSL=false",
                    "root",
                    "212121"
            );
            //获取传输器
            Statement stat = cnn.createStatement();
            //执行sql语句， 此处是executeUpdate，而不是executeQuery， 因为新增不会返回表格数据,而是受影响的行数index （int）
            String sqlSentence = "insert into account value(null, 'Hellen', 3500)";
            int row = stat.executeUpdate(sqlSentence);
            //处理结果
            System.out.println("影响的行Index为 " + row);
            //释放资源
            stat.close();
            cnn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*
    将 name为Hellen的金额修改为5000
     */
    @Test
    public void testUpdate() {
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            Connection cnn = DriverManager.getConnection(
                    "jdbc:mysql:///fx_db?characterEncoding=utf-8&serverTimezone=UTC&useSSL=false",
                    "root",
                    "root"
            );
            //获取传输器
            Statement stat = cnn.createStatement();
            //执行sql语句， 此处是executeUpdate，而不是executeQuery， 因为新增不会返回表格数据,而是受影响的行数index （int）
            String sqlSentence = "update account set money = 5000 where name = 'Hellen'";
            int row = stat.executeUpdate(sqlSentence);
            //处理结果
            System.out.println("影响的行Index为 " + row);
            //释放资源
            stat.close();
            cnn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    将 tom数据删除
 */
    @Test
    public void deleteUpdate()  {
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            Connection cnn = DriverManager.getConnection(
                    "jdbc:mysql:///fx_db?characterEncoding=utf-8&serverTimezone=UTC&useSSL=false",
                    "root",
                    "root"
            );
            //获取传输器
            Statement stat = cnn.createStatement();
            //执行sql语句， 此处是executeUpdate，而不是executeQuery， 因为新增不会返回表格数据,而是受影响的行数index （int）
            String sqlSentence = "delete from account where name = 'Hellen'";
            int row = stat.executeUpdate(sqlSentence);
            //处理结果
            System.out.println("影响的行Index为 " + row);
            //释放资源
            stat.close();
            cnn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

