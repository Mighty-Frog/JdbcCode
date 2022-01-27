package com.JinCheng;

import com.JinCheng.pojo.Emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询yonghedb.emp表中的所有数据
 * 		将每条记录封装到一个Emp对象中,再将每一个Emp对象封装到List集合中
 */

public class JdbcTest {
    public static void main(String[] args) {
        try {
            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get conncection
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql:///yonghedb?characterEnconding=utf-8&serverTimezone=UTC&useSSL=false",
                    "root",
                    "212121"
            );
            //get transporter
            Statement state = conn.createStatement();
            //excute sql ，get result
            ResultSet rs = state.executeQuery("" +
                    "select * from emp");
            //iterate data in objects of result set, encapsulate each data into a Emp object
            List<Emp> list = new ArrayList();
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job = rs.getString("job");
                double salary = rs.getDouble("salary");
                Emp emp = new Emp(id,name,job,salary);
                list.add(emp);
            }
            //test
            for (Emp emp: list) {
                System.out.println(emp.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
