package com.generalSystem.server.impl;

import com.generalSystem.mapper.SystemUserMapper;
import com.generalSystem.server.SystemUserServer;
import org.springframework.beans.factory.annotation.Autowired;

public class SystemUserServerImpl implements SystemUserServer {

    @Autowired
    private SystemUserMapper systemUserMapper;


}
