package com.google.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by HuangHaoDong on 2017/10/26 on 19:57.
 */

@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /**
     * 微信公众平台授权url
     */
    private String wechatMpAutorize;

    /**
     * 微信开放平台授权
     */
    private String wechatOpenAuthorize;

    /**
     * 点餐系统
     */
    private String sell;

}
