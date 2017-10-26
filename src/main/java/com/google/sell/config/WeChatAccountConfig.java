package com.google.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by HuangHaoDong on 2017/10/26 on 19:44.
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatAccountConfig {

    /**
     * 公共平台id
     */
    private String mpAppId;

    /**
     * 公共平台密匙
     */
    private String mpAppSecret;

    /**
     * 开放平台id
     */
    private String openAppId;

    /**
     * 开放平台密匙
     */
    private String openAppSecret;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密匙
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String KeyPath;

    /**
     * 微信支付异步通知地址
     */
    private String  notifyUrl;

    /**
     * 微信模板id
     */
    private Map<String, String> templateId;



}