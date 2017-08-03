package com.cly.test.main.utils.assist;

/**
 * @ Filename Bean02.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 11:13</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public class Bean02 {

    private String A;

    private int B;

    private String C;

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    @Override
    public String toString() {
        return "Bean02{" +
                "A='" + A + '\'' +
                ", B=" + B +
                ", C='" + C + '\'' +
                '}';
    }
}
