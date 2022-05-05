package com.xjz.controller;

import com.xjz.entity.GeoData;
import com.xjz.repository.GeoMapper;
import com.xjz.service.FindLastService;
import com.xjz.vo.GeoDatavo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class controller {
    @Autowired
    private FindLastService service;
//    @CrossOrigin
//    @GetMapping("/geo")
//    public List<Map<String,String>> find2(){
//        return  service.findLast();
//    }
    @CrossOrigin
    @GetMapping("/find")
    public GeoDatavo findLast(){
        return service.findLastData();
    }
}
