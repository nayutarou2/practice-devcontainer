package com.example.practice_devcontainer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.practice_devcontainer.repository.TestRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping("/")
    public ResponseEntity home() {

        return ResponseEntity.ok().body(testRepository.selectAll());
        
    }

}
