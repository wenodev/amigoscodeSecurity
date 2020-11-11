package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    DefaultListableBeanFactory df;

    @Test
    void beans() {
        System.out.println("==========");
        for (String name : df.getBeanDefinitionNames()) {
            System.out.println(name + " : " + df.getBean(name).getClass().getName());
        }
        System.out.println("==========");
    }

}
