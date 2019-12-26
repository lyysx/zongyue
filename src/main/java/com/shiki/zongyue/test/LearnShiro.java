package com.shiki.zongyue.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;



/**
 * @author shiki
 * @version 1.0
 * @date 2019/12/26
 **/
public class LearnShiro {
    @Test
    public void testHelloworld() {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("C:\\Users\\liuyangyang\\Desktop\\zongyue\\src\\main\\resources\\shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("阿萨德", "1234");
        try {
            //4、登录，即身份验证
            subject.login(token);
        } catch (AuthenticationException e) {
            //5、身份验证失败
        }
        Assert.assertEquals(true, subject.isAuthenticated());
        subject.logout();
    }
}
