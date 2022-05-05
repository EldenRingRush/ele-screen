package com.xjz.controller;

import com.xjz.entity.PlayTable;
import com.xjz.service.JsoupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class JsoupHandler {
    @Autowired
    private JsoupService jsoupService;

    @GetMapping("/jsoup")
    @CrossOrigin
    public PlayTable jsoupGet() throws IOException {
        return jsoupService.jsoupNews();
    }
}
