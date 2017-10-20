package com.google.sell.utils;

import com.google.sell.enums.CodeEnum;

/**
 * Created by HuangHaoDong on 2017/10/20 on 20:35.
 */

public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
