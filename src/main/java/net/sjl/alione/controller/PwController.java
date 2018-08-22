package net.sjl.alione.controller;

import net.sjl.alione.cnf.ConfigTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 *
 * @Author:shijialei
 * @Version:1.0
 * @Date:2018/1/11
 */
@RestController
@RequestMapping("/pw")
public class PwController {

    private static final Logger log = LoggerFactory.getLogger(PwController.class);

    @Autowired
    ConfigTest configTest;

    @RequestMapping("/test")
    public void test(){

        System.out.println(configTest.getAk());
    }

}
