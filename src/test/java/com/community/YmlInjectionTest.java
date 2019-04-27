package com.community;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YmlInjectionTest {
    @Value("${propertyTest}")
    String testVal;

    @Test
    public void hasInjection(){
        Assert.assertNotNull(testVal);
    }
}
