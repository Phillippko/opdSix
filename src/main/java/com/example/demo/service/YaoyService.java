package com.example.demo.service;

import com.example.demo.model.Yaoy;
import com.example.demo.repository.YaoyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class YaoyService {
    private final YaoyRepository yaoyRepository;

    public List<Yaoy> getYaoy() {
        return yaoyRepository.findAll();
    }

    public void saveYaoy(List<Yaoy> yaoyToSave) {
        yaoyRepository.saveAll(yaoyToSave);
    }
}
