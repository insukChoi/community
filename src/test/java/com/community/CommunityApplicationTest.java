package com.community;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"property.value=propertyTest"},
         webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class CommunityApplicationTest {

    @Value("${property.value}")
    private String propertyValue;

    @Test
    public void contextLoads(){
        //assertThat(value, is("test"));
        assertThat(propertyValue, is("propertyTest"));
    }
}