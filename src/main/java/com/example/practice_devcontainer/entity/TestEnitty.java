package com.example.practice_devcontainer.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TestEnitty {
    
    private Long id;
    private String name;
    private LocalDateTime createdAt;

}
