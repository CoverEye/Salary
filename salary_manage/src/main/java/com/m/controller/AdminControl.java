package com.m.controller;


import com.m.domain.User;
import com.m.service.AdminService;

import com.m.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminControl {
    /*** 登录
     * @author CloseEye
     */
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;

    @RequestMapping("/Regist")
    public String Regist(String userId, String userName, Integer sex, String password, HttpSession session) {
        User user = new User();
        user.setUserId(userId);
        user.setSex(sex);
        user.setUserName(userName);
        user.setPassword(password);
        adminService.regist(user);

        return "redirect:/login.jsp";
    }

    /*** 更新权限
     * @author CloseEye
     */
    @RequestMapping("/UpdateType")
    public String updateType(String userId, Integer userType, HttpSession session) {

        userService.updateType(userId, userType);

        return "redirect:/login.jsp";
    }
}
