package com.community.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class BookRestController {
    @Autowired
    private BookRestService bookRestService;

    @GetMapping(path = "/rest/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getRestBook(){
        return bookRestService.getRestBook();
    }
}
