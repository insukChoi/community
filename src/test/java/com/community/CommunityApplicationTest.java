package com.community;

import com.community.book.BookRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommunityApplicationTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    public void hasDependency(){
        Assert.assertNotNull(bookRepository);
    }
}