package com.feng.mm.controller;

import com.feng.mm.domain.entity.Level;
import com.feng.mm.service.LevelService;
import com.feng.mm.utils.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/level")
public class LevelController {
    @Resource
    LevelService levelService;

    @GetMapping("/list")
    public ResponseEntity list() {
        List<Level> levels = levelService.levelList();
        return ResponseEntity.success(levels);
    }
}
