package com.example.demo.controller;

import com.example.demo.model.Yaoy;
import com.example.demo.service.YaoyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class YaoyRestController {
    private final YaoyService yaoyService;

    @PostMapping("/yaoy")
    public void saveYaoy(@RequestBody List<Yaoy> yaoyList) {
        yaoyService.saveYaoy(yaoyList);
    }
}
