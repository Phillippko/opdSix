package com.example.demo.controller;

import com.example.demo.model.Yaoy;
import com.example.demo.service.YaoyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class YaoyController {
    private final YaoyService yaoyService;

    @GetMapping("/yaoy")
    public ModelAndView getYaoy() {
        return
                new ModelAndView(
                        "getYaoy.html",
                        Map.of("yaoyList", yaoyService.getYaoy()));
    }

}
