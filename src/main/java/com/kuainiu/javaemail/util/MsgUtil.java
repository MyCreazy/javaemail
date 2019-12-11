package com.kuainiu.javaemail.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 信息辅助类
 */
public class MsgUtil {
    /**
     * 时间对象
     */
    private final static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    /**
     * 打印信息
     *
     * @param content
     */
    public static void printMsg(String content) {
        Date currenttime = new Date();
        System.out.println(df.format(currenttime) + " 打印信息【" + content + "】");
    }
}
