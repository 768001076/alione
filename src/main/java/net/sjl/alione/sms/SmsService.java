package net.sjl.alione.sms;

/**
 * @Description: 短信发送
 *
 * @Author:shijialei
 * @Version:1.0
 * @Date:2018/1/16
 */
public class SmsService {

    public static String sendRequestWarnMessage(String externalIp, String externalPort, String local){
        //设置超时时间-可自行调整
        System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
        System.setProperty("sun.net.client.defaultReadTimeout", "10000");
        //初始化ascClient需要的几个参数
        final String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
        final String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）

        //AK


        return "";
    }

}
