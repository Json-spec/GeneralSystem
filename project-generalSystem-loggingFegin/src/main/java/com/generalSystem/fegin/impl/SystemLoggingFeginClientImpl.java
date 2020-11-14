package com.generalSystem.fegin.impl;

import com.generalSystem.fegin.SystemLoggingFegin;
import com.generalSystem.model.SysLog;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class SystemLoggingFeginClientImpl implements FallbackFactory<SystemLoggingFegin> {
    @Override
    public SystemLoggingFegin create(Throwable throwable) {
        return new SystemLoggingFegin() {
            @Override
            public int savaLog(SysLog sysLog) {
                return 0;
            }
        };
    }
}
