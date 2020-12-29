package com;

import com.domain.Order;
import com.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
@Component
public class MyTest {

    @Autowired
    private TestService testService;

    @Test
    public void test(){
        Order one = testService.getOne("1");
        System.out.println(one);
    }
}