package com.google.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by HuangHaoDong on 2017/10/19 on 23:17.
 */

@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String userName;

    private String password;

    private String openid;

}
