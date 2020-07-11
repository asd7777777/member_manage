package com.feng.mm.mapper;

import com.feng.mm.domain.entity.Level;
import com.feng.mm.exception.DaoException;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LevelMapper {
    List<Level> selectAll() throws DaoException;

    Level selectById(@Param("lid") int lid) throws DaoException;
}
