package com.kuainiu.javaemail.model;

/**
 * email发送对象
 */
public class MEmail {
    /**
     * 发送邮件的内容
     */
    private  String sendContend="";

    /**
     * 发送邮件的主题
     */
    private  String sendEmailTitle="";

    /**
     * 邮件接收人，多个以逗号隔开
     */
    private  String receivePerson="";

    /**
     * 附件地址
     */
    private  String attchPath="";

    /**
     * 附件名称
     */
    private  String attchName="";

    /**
     * 获取附件名称
     * @return
     */
    public String getAttchName() {
        return attchName;
    }

    /**
     * 设置附件名称
     * @param attchName
     */
    public void setAttchName(String attchName) {
        this.attchName = attchName;
    }

    /**
     * 获取附件地址
     * @return
     */
    public String getAttchPath() {
        return attchPath;
    }

    /**
     * 设置附件地址
     * @param attchPath
     */
    public void setAttchPath(String attchPath) {
        this.attchPath = attchPath;
    }

    /**
     * 获取发送内容
     * @return
     */
    public String getSendContend() {
        return sendContend;
    }

    /**
     * 设置发送内容
     * @param sendContend
     */
    public void setSendContend(String sendContend) {
        this.sendContend = sendContend;
    }

    /**
     * 获取邮件主题
     * @return
     */
    public String getSendEmailTitle() {
        return sendEmailTitle;
    }

    /**
     * 设置邮件主题
     * @param sendEmailTitle
     */
    public void setSendEmailTitle(String sendEmailTitle) {
        this.sendEmailTitle = sendEmailTitle;
    }

    /**
     * 获取邮件接收人信息，多个以逗号隔开
     * @return
     */
    public String getReceivePerson() {
        return receivePerson;
    }

    /**
     * 设置邮件接收人信息，多个以逗号隔开
     * @param receivePerson
     */
    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson;
    }
}
