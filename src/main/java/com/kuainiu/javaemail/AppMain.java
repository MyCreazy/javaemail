package com.kuainiu.javaemail;

import com.kuainiu.javaemail.model.MEmail;
import com.kuainiu.javaemail.util.MsgUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 入口类
 */
public class AppMain {
    /**
     * main 函数
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        MEmail email = new MEmail();
        ////检查相关参数
        if (args.length < 3) {
            throw new Exception("请配置邮件发送的相关信息,至少包含邮件主题，邮件内容，接收邮件的人");
        } else {
            email.setSendEmailTitle(args[0]);
            email.setSendContend(args[1]);
            email.setReceivePerson(args[2]);
            if (args.length > 3) {
                email.setAttchName(args[3]);
                email.setAttchPath(args[4]);
            }
        }

        try {
            ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:springconfig.xml");
            ////加载spring相关配置文件
            BusControl maincontrol = factory.getBean(BusControl.class);
            String result = maincontrol.sendMail(email);
            MsgUtil.printMsg(result);
        } catch (Exception ex) {
            MsgUtil.printMsg("发送邮件异常:" + ex.getMessage());
        }
    }
}
