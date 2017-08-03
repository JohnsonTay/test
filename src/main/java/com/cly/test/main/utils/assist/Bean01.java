package com.cly.test.main.utils.assist;

/**
 * @ Filename Bean01.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 11:13</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public class Bean01 {

    private String A;

    private String B;

    public Bean01(){}

    public Bean01(String a, String b) {
        A = a;
        B = b;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    @Override
    public String toString() {
        return "Bean01{" +
                "A='" + A + '\'' +
                ", B='" + B + '\'' +
                '}';
    }
}
