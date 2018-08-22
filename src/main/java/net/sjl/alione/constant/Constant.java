package net.sjl.alione.constant;

import net.sjl.alione.cnf.DefulConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 全局公用
 *
 * @Author:shijialei
 * @Version:1.0
 * @Date:2018/1/22
 */
@Component
public class Constant {

    /*
     * 链接白名单
     */
    public static Map<String,Integer> connectionwhite = new HashMap<String, Integer>();

    /*
     * 默认配置
     */
    @Autowired
    private DefulConfig defulConfig;
    public static DefulConfig DefulConfig;
    @PostConstruct
    public void init(){
        this.DefulConfig = defulConfig;
    }

}
