package com.cly.test.main.controller;

import com.cly.test.main.base.TestConstant;
import com.cly.test.main.json.assist.FastJsonSendContent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Filename FastJsonController.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 11:41</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping("/fastJson")
public class FastJsonController {


    /**
     * 解析JSON字符串测试
     *   --
     *   --
     */
    @RequestMapping("parseJson")
    public Object parseJson(){
        FastJsonSendContent sendContent = new FastJsonSendContent();
        sendContent.setA(TestConstant.A);
        sendContent.setC(TestConstant.C);

        return sendContent;
    }
}
