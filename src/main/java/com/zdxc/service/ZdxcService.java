package com.zdxc.service;

import com.zdxc.entity.Zdxc;

public interface ZdxcService {
    int insert(Zdxc payment);

    Zdxc select(long id);

    int selectByCode(String code);

    int update(Zdxc zdxc);
}
