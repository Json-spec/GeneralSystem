package com.generalSystem.controller;


import com.generalSystem.model.SysLog;
import com.generalSystem.result.ResultConfig;
import com.generalSystem.server.SystemLogglingServer;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemLoggingController {

    private static final Logger logger = LoggerFactory.getLogger(SystemLoggingController.class);

    @Autowired
    private SystemLogglingServer systemLogglingServer;

    @RequestMapping("/saveSysLog")
    @ApiOperation(value = "记录api调用日志",notes = "记录api调用日志")
    public ResultConfig saveSysLog(@RequestBody SysLog sysLog){
        Boolean flage =  systemLogglingServer.insertSelective(sysLog) > 0 ? true : false ;
        if(flage){
            return new ResultConfig(200,"操作成功",null);
        }else{
            return new ResultConfig(400,"操作失败",null);
        }
    }
}
