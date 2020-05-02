package com.zdxc.dao;

import com.zdxc.entity.Zdxc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.MappedTypes;

@Mapper
public interface ZdxcDao {
    int insert(Zdxc zdxc);

    Zdxc select(long id);

    int selectByCode(String code);

    int update(Zdxc zdxc);
}
