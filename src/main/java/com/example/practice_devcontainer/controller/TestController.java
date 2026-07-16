package com.example.practice_devcontainer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.practice_devcontainer.repository.TestRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping("/")
    public ResponseEntity<?> home() {
        System.out.println("🔌 フロントからの疎通リクエストを検知しました！データを返します。");

        return ResponseEntity.ok().body(testRepository.selectAll());

    }

}
