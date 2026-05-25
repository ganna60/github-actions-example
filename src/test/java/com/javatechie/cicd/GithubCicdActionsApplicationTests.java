package com.javatechie.cicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubCicdActionsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test1() {
        Assertions.assertEquals(1, 2);
    }

}
