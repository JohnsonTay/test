package com.cly.test.main.json;

import com.alibaba.fastjson.JSONObject;
import com.cly.test.main.TestMain;
import com.cly.test.main.controller.FastJsonController;
import com.cly.test.main.json.assist.FastJsonReceiveContent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @ Filename FastJsonControllerTest.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 10:42</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TestMain.class)
public class FastJsonControllerTest {

    private RestTemplate restTemplate = new RestTemplate();


    /**
     * 测试Web请求
     */
    @Test
    public void testParse() {
        String url = "http://localhost:8800/fastJson/parseJson";

        //请求参数
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
        map.add("res01", "res01");

        //不使用FastJson
//        FastJsonReceiveContent result = restTemplate.postForObject(url, map, FastJsonReceiveContent.class);

        //使用FastJson
        String result = restTemplate.postForObject(url, map, String.class);
        FastJsonReceiveContent content = JSONObject.parseObject(result, FastJsonReceiveContent.class);
        System.out.println(content);
    }


}
