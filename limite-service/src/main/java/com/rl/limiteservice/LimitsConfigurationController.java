package com.rl.limiteservice;

import com.rl.limiteservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rodrigo
 * @version 1.0
 * @since 07/10/2019
 */
@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsConfigutaions(){
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }

}
