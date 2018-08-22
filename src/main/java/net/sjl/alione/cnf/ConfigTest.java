package net.sjl.alione.cnf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description: 自定义配置文件测试
 *
 * @Author:shijialei
 * @Version:1.0
 * @Date:2018/1/16
 */
@Component
@ConfigurationProperties(prefix = "my")
@PropertySource(value = "classpath:yml/Ali.yml")
public class ConfigTest {

    @Value("${ak}")
    public String ak;

    @Value("${ap}")
    public String ap;

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }
}
