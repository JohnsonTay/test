package com.cly.test.main.string;

import org.springframework.util.StringUtils;

/**
 * @ Filename FastJsonControllerTest.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 10:42</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public class StringTest {

    public static void main(String[] args){
        String str = "123,4567,,89,,,,";
        for(String split: splitComma(str)){
            System.out.println(split);
        }
    }

    //split分隔末尾多个逗号，保留末尾空字符
    private static String[] splitComma(String str){
        return str.split(",",-1);
    }
    //split分隔末尾多个逗号,不保留末尾空字符
    private static String[] splitComma2(String str){
        return str.split(",",-1);
    }

}
