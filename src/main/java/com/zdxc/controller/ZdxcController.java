package com.zdxc.controller;

import com.zdxc.entity.CommonResult;
import com.zdxc.entity.Zdxc;
import com.zdxc.service.ZdxcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;


@Slf4j
@RestController
@RequestMapping("/")
public class ZdxcController {

    @Resource
    private ZdxcService zdxcService;

    @GetMapping("insert")
    public CommonResult insert(Zdxc zdxc){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String creaettime=sdf.format(new Date());
        zdxc.setCreateTime(creaettime);
        zdxc.setUpdateTime(creaettime);
        int resultCode=zdxcService.insert(zdxc);
        log.info("打印"+zdxc.toString());
        if(resultCode>0){
            return new CommonResult(200,"插入成功",resultCode);
        }else{
            return new CommonResult(400,"插入失败",null);
        }
    }
}


