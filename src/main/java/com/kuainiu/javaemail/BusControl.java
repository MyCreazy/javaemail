package com.kuainiu.javaemail;

import com.kuainiu.javaemail.model.MEmail;
import com.kuainiu.javaemail.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 业务控制类
 */
@Component
public class BusControl {
    /**
     * 邮箱对象
     */
    @Autowired
    private EmailUtil emailUtil;

    /**
     * 发送邮件
     *
     * @param sendEmailObj
     * @return
     */
    public String sendMail(MEmail sendEmailObj) {
        String result = "";
        boolean temp = emailUtil.sendMail(sendEmailObj.getSendEmailTitle(), sendEmailObj.getSendContend(), sendEmailObj.getReceivePerson(),sendEmailObj.getAttchPath(),sendEmailObj.getAttchName());
        if (temp) {
            result = "邮件发送成功！！！";
        } else {
            result = "邮件发送失败！！！";
        }

        return result;
    }
}
