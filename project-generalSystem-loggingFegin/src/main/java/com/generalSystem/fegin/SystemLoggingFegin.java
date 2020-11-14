package com.generalSystem.fegin;

import com.generalSystem.fegin.impl.SystemLoggingFeginClientImpl;
import com.generalSystem.model.SysLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "logger-server" , fallbackFactory = SystemLoggingFeginClientImpl.class)
public interface SystemLoggingFegin {

    @RequestMapping("/saveSysLog")
    int savaLog(SysLog sysLog);
}
