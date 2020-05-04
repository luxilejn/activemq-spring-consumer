package com.etoak.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    
    // 邮件主题
    private String subject;
    
    // 收件人 - 注册时填写的邮箱地址
    private String receiver;
    
    // 邮件内容
    private String content;
    
}
