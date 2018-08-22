package net.sjl.alione.hession;

import net.sjl.alione.entity.HessionBean;
import org.springframework.stereotype.Service;

/**
 * @Description: hession测试实现类
 *
 * @Author:shijialei
 * @Version:1.0
 * @Date:2018/1/18
 */
@Service("HessionProviderTestService")
public class HessionProviderTestServiceImpl implements HessionProviderTestService {
    @Override
    public String hello() {
        return "Hello First Hession Demo !";
    }

    @Override
    public HessionBean getHessionBean() {
        HessionBean hessionBean = new HessionBean();
        hessionBean.setHost("127.0.0.1");
        hessionBean.setPort("6543");
        hessionBean.setUrl("http://127.0.0.1:6543/hessionProviderTestService");
        return hessionBean;
    }
}
