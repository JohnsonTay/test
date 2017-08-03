package com.cly.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.core.env.SimpleCommandLinePropertySource;

/**
 * @ Filename TestMain.java
 * @ Description
 * @ Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/3 10:38</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */

@SpringBootApplication
public class TestMain extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(TestMain.class);
        app.run(args);
    }
}
