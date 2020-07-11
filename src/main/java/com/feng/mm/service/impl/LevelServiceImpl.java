package com.feng.mm.service.impl;

import com.feng.mm.domain.entity.Level;
import com.feng.mm.mapper.LevelMapper;
import com.feng.mm.service.LevelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {
    @Resource
    LevelMapper levelMapper;

    @Override
    //查找等级列表
    public List<Level> levelList() {
        List<Level> levels = levelMapper.selectAll();
        return levels;
    }
}
