package com.project.base.service.impl;

import javax.mail.internet.MimeMessage;

/**
 * @author yinshaobo
 * 2019/4/12 14:31
 */
public class TextEmailServiceImpl extends AbstractEmailService {

    public TextEmailServiceImpl(String senderAddress, String senderPassword) {
        super(senderAddress, senderPassword);
    }

    @Override
    public void operate(MimeMessage msg, String content, String filePath) throws Exception {
        //设置邮件正文
        msg.setContent(content, "text/html;charset=UTF-8");
    }
}
