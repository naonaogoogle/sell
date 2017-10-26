package com.google.sell.utils;

import java.util.Random;

/**
 * Created by HuangHaoDong on 2017/10/26 on 20:45.
 */

public class KeyUtil {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
