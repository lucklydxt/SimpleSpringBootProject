package com.zdxc.service.impl;

import com.zdxc.dao.ZdxcDao;
import com.zdxc.entity.Zdxc;
import com.zdxc.service.ZdxcService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ZdxcServiceImpl implements ZdxcService {

    @Resource
    private ZdxcDao zdxcDao;

    @Override
    public int insert(Zdxc zdxc) {
        int code=0;
        //插入之前先判断是否已经存在
       int count= selectByCode(zdxc.getCode());
       if(count>0){
           //更新
           code=update(zdxc);
           if(code>0){
               System.out.println("更新成功");
           }else{
               System.out.println("更新失败");
           }

       }else{
           //插入
           code=zdxcDao.insert(zdxc);
           if(code>0){
               System.out.println("插入成功");
           }else{
               System.out.println("插入失败");
           }
       }
        return code;
    }

    @Override
    public Zdxc select(long id) {
        return zdxcDao.select(id);
    }

    @Override
    public int selectByCode(String code) {
        return zdxcDao.selectByCode(code);
    }

    @Override
    public int update(Zdxc zdxc) {
        return zdxcDao.update(zdxc);
    }
}
