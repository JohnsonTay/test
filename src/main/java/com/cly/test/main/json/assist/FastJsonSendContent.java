package com.cly.test.main.json.assist;

/**
 * @ Filename FastJsonSendContent.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 11:50</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public class FastJsonSendContent {

    private String A;

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

    @Override
    public String toString() {
        return "FastJsonSendContent{" +
                "A='" + A + '\'' +
                ", C='" + C + '\'' +
                '}';
    }
}
