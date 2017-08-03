package com.cly.test.main.json.assist;

/**
 * @ Filename FastJsonReceiveContent.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 11:50</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public class FastJsonReceiveContent {

    private String A;

    private String B;

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
        return "FastJsonReceiveContent{" +
                "A='" + A + '\'' +
                ", B='" + B + '\'' +
                '}';
    }
}
