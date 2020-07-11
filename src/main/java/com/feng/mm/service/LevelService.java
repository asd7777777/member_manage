package com.feng.mm.service;

import com.feng.mm.domain.entity.Level;
import com.feng.mm.exception.ServiceException;

import java.util.List;

public interface LevelService {
    List<Level> levelList() throws ServiceException;
}
