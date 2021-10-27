package com.m.Bayesclass;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FetchData {

    //连接数据库，读取训练数据
    //输入：数据库
    //输出：可变长数组

    public ArrayList<ArrayList<String>> fetch_traindata() {
        ArrayList<ArrayList<String>> dataSet = new ArrayList<ArrayList<String>>();
        //待返回

        Connection conn;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/salary_manage?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true";
        //指向要访问的数据库！注意后面跟的是数据库名称
        String user = "root";
        //navicat for sql配置的用户名
        String password = "rootroot";
        //navicat for sql配置的密码
        try {
            Class.forName(driver);
            //用class加载动态链接库——驱动程序
            conn = DriverManager.getConnection(url, user, password);
            //利用信息链接数据库
            if (!conn.isClosed()) {
                System.out.println("Succeeded connecting to the Database!");
            }


            Statement statement = conn.createStatement();
            //用statement 来执行sql语句
            String sql = "select * from test";
            //这是sql语句中的查询某个表，注意后面的emp是表名！！！
            ResultSet rs = statement.executeQuery(sql);
            //用于返回结果

            String str = null;
            while (rs.next()) {
                //一直读到最后一条表
                ArrayList<String> s = new ArrayList<String>();
                str = rs.getString("isundergraduate");
                //分别读取相应栏位的信息加入到可变长数组中
                s.add(str);

                str = rs.getString("isProjectexperience");
                s.add(str);
                str = rs.getString("sex");
                s.add(str);
                str = rs.getString("major");
                s.add(str);
                str = rs.getString("position");
                s.add(str);
                dataSet.add(s);
                //加入dataSet
                //System.out.println(s);  输出中间结果调试
            }
            rs.close();
            conn.close();
        } catch (ClassNotFoundException e) {  //catch不同的错误信息，并报错
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("数据库训练数据读取成功！");
        }
        return dataSet;
    }


    public ArrayList<String> read_testdata(String str) throws IOException  //将用户输入的一整行字符串分割解析成可变长数组
    {
        ArrayList<String> testdata = new ArrayList<String>();
        //待返回
        StringTokenizer tokenizer = new StringTokenizer(str);
        while (tokenizer.hasMoreTokens()) {
            testdata.add(tokenizer.nextToken());
        }
        return testdata;
    }
}