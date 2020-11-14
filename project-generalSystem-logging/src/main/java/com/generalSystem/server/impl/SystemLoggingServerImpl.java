package com.generalSystem.server.impl;

import com.generalSystem.mapper.SystemLoggingMapper;
import com.generalSystem.model.SysLog;
import com.generalSystem.server.SystemLogglingServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemLoggingServerImpl implements SystemLogglingServer {

    @Autowired
    private SystemLoggingMapper systemLoggingMapper;

    @Override
    public int insertSelective(SysLog sysLog) {
        return systemLoggingMapper.insert(sysLog);
    }
}
