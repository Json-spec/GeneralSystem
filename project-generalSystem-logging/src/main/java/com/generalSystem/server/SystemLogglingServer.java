package com.generalSystem.server;

import com.generalSystem.model.SysLog;

public interface SystemLogglingServer {


    int insertSelective(SysLog sysLog);
}
