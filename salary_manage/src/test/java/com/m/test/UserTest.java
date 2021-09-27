package com.m.test;

import com.m.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:spring-mvc.xml"})
public class UserTest {
    @Autowired
    private UserService userService;

    /*** 登录测试1
     * @author CloseEye
     */
    @Test
    public void test1() {
        assertNotNull(userService.login(
                "001", "123"));
    }

    /*** 登录测试2
     * @author CloseEye
     */
    @Test
    public void test2() {
        assertNull(userService.login("001", "1324"));

    }
}
