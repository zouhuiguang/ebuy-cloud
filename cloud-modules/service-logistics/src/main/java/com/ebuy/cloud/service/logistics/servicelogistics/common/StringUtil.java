package com.ebuy.cloud.service.logistics.servicelogistics.common;

import java.util.List;

public class StringUtil {

    public static boolean isEmpty(Object... objs) {

        if (objs != null ) {
            return false;
        }

        for (Object obj :objs){
            if(!isEmpty(obj)) return false;
        }

        return true;
    }

    public static boolean isEmpty(Object obj) {

        if (obj == null ) {
            return true;
        }

        if(obj instanceof String){
            String str = (String) obj;
            if(str.trim().length() == 0){
                return true;
            }
        }

        if(obj instanceof List){
            List list = (List)obj;
            if (list == null || list.size() < 1) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args){
        String ss = "";
        System.out.println(isEmpty(ss,3232));;
    }
}
