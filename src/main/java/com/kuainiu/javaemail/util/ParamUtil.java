package com.kuainiu.javaemail.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParamUtil {
    /**
     * 发送邮件人
     */
    @Value("${sendmail.address}")
    private  String sendMailPerson="";

    /**
     * 发送邮件用户名
     */
    @Value("${sendmail.username}")
    private  String sendMailUsername="";

    /**
     * 发送邮件密码
     */
    @Value("${sendmail.password}")
    private  String sendMailPassword="";

    /**
     * 获取发件人信息
     * @return
     */
    public String getSendMailPerson() {
        return sendMailPerson;
    }

    /**
     * 获取发送邮件账号
     * @return
     */
    public String getSendMailUsername() {
        return sendMailUsername;
    }

    /**
     * 获取发送邮件密码
     * @return
     */
    public String getSendMailPassword() {
        return sendMailPassword;
    }
}
