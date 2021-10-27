package com.m.Bayesclass;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BayesMain {

    //主函数，读取数据库，并读入待判定数据，输出结果
    public static void main(String[] args) {
        FetchData fdata = new FetchData();
        //java对函数的调用要先声明相应的对象再调用
        Bayes bys = new Bayes();
        ArrayList<ArrayList<String>> dataSet = null;
        //训练数据列表
        ArrayList<String> testSet = null;
        //测试数据
        try {
            System.out.println("从数据库读入训练数据：");
            dataSet = fdata.fetch_traindata();
            //读取训练数据集合
            System.out.println("请输入测试数据：");
            Scanner cin = new Scanner(new BufferedInputStream(System.in));
            //从标准输入输出中读取测试数据
            while (cin.hasNext())
            //支持多条测试数据读取
            {
                String str = cin.nextLine();
                //先读入一行
                testSet = fdata.read_testdata(str);
                //将这一行进行字符串分隔解析后返回可变长数组类型
                //System.out.println(testSet);  //输出中间结果
                ArrayList<String> testdata = new ArrayList<String>();
                testdata.add("yes");
                testdata.add("yes");
                testdata.add("man");
                testdata.add("finance");
                String ans = bys.bys_Main(dataSet, testdata);
                //调用贝叶斯分类器
                if (ans.equals("DEV")) {
                    System.out.println("根据已有数据适合开发人员");
                }else if (ans.equals("finance")) {
                    System.out.println("根据已有数据适合财务人员");
                }
                //输出结果
                else {
                    System.out.println("不适合职位要求");
                }
            }
            cin.close();
        } catch (IOException e) {  //处理异常
            e.printStackTrace();
        }

    }
public String  bayes(ArrayList<String> testdata){
    FetchData fdata = new FetchData();
    //java对函数的调用要先声明相应的对象再调用
    Bayes bys = new Bayes();
    ArrayList<ArrayList<String>> dataSet = null;
    //训练数据列表
    ArrayList<String> testSet = null;
    //测试数据
    try {
        System.out.println("从数据库读入训练数据：");
        dataSet = fdata.fetch_traindata();
        //读取训练数据集合
        System.out.println("请输入测试数据：");
        Scanner cin = new Scanner(new BufferedInputStream(System.in));
        //从标准输入输出中读取测试数据
//        while (cin.hasNext())
        Iterator it1 = testdata.iterator();
        while (it1.hasNext())
        //支持多条测试数据读取
        {
//            String str = cin.nextLine();
//            //先读入一行
//            testSet = fdata.read_testdata(str);
            //将这一行进行字符串分隔解析后返回可变长数组类型
            //System.out.println(testSet);  //输出中间结果
//            ArrayList<String> testdata = new ArrayList<String>();
//            testdata.add("yes");
//            testdata.add("yes");
//            testdata.add("man");
//            testdata.add("finance");
            String ans = bys.bys_Main(dataSet, testdata);
            //调用贝叶斯分类器
            if (ans.equals("DEV")) {
                String str1="根据已有数据适合开发人员";
                return str1;

//                System.out.println("根据已有数据适合开发人员");

            }else if (ans.equals("finance")) {
                String str2="根据已有数据适合财务人员";
                return str2;
//                System.out.println("根据已有数据适合财务人员");
            }
            //输出结果
            else {
                String str3="不适合职位要求"; System.out.println("不适合职位要求");
                return str3;

            }
        }
        cin.close();
    } catch (Exception e) {  //处理异常
        e.printStackTrace();
    }return  null;
}
}