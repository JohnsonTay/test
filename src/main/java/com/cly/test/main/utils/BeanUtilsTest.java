package com.cly.test.main.utils;

import com.cly.test.main.utils.assist.Bean01;
import com.cly.test.main.utils.assist.Bean02;
import org.springframework.beans.BeanUtils;

/**
 * @ Filename BeanUtilsTest.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 10:42</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public class BeanUtilsTest {

    public static void main(String[] args){
        testCopyProperties01();
    }

    /**
     * BeanUtils.copyProperties测试
     *  -- 只有类型相同、参数名字相同的才会复制值
     *  -- 目标对象多参数、少参数、类型不同而参数名相同的情况都OK
     */
    public static void testCopyProperties01(){
        Bean01 bean01 = new Bean01("a", "b");
        Bean02 bean02 = new Bean02();
        BeanUtils.copyProperties(bean01, bean02);

        System.out.println(bean02);
    }

}
