package com.speily.ootb.common.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther: SPL
 * @Date: 2019-03-21 13:58
 * @Description:
 */
public class MyUtils extends StringUtils {
    public String handleDemo(String str){
        if(str.equals("666")){
            return "HaHaHa";
        }

        return str;
    }
}
