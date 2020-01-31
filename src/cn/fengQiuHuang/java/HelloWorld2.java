package cn.fengQiuHuang.java;

import cn.fengQiuHuang.bean.Customer;

import java.util.ArrayList;

/**
 * @author 秦坤
 * @createDate 2020/1/31-15:14
 */
public class HelloWorld2 {
    /**
     * IDEA中的
     */
    private static final Customer CUS = new Customer();
    public static final int NUM = 1;

    public static final int NUM2 = 3;

    public static final String SS = "AAAA";

    public static void main(String[] args) {
        System.out.println("helloworld");
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        System.out.println(a);

        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld2.main");
        System.out.println("a = " + a);
        String[] str = new String[]{"aa","bb","cc","dd"};
        System.out.println("args = [" + args + "]");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }
        for (String s : str) {
            System.out.println(s);
        }
        for (Object o : a) {
            
        }
        for (int i = 0; i < a.size(); i++) {
            
        }
        for (int i = a.size() - 1; i >= 0; i--) {

        }
        if (str == null) {

        }
        if (a == null) {

        }
        if (a != null) {

        }
        if (a != null) {

        }
        if (a == null) {

        }
        if ("" == null) {

        }
        if (a != null) {

        }

    }

}
