package net.sjl.alione.cnf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description: 默认配置
 *
 * @Author:shijialei
 * @Version:1.0
 * @Date:2018/1/22
 */
@Component
@ConfigurationProperties(prefix = "def")
@PropertySource(value = "classpath:yml/def.yml")
public class DefulConfig {

    @Value("${white_frequency}")
    private String whiteFrequency;

    public String getWhiteFrequency() {
        return whiteFrequency;
    }

    public void setWhiteFrequency(String whiteFrequency) {
        this.whiteFrequency = whiteFrequency;
    }
}
