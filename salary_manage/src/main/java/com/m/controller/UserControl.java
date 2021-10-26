package com.m.controller;

import com.m.domain.User;
import com.m.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserControl {
    @Autowired
    private UserService userService;

    /*** 登录
     * @author CloseEye
     */
    @RequestMapping("/login")
    public String login(String userId, String password, HttpSession session) {

        User user = userService.login(userId, password);
        if (user != null) {
            //登录成功  将user存储到session
            session.setAttribute("user", user);

            return "redirect:/index.jsp";
        }
        return "redirect:/login.jsp";
    }


    /*** 更新权限
     * @author CloseEye
     */
    @RequestMapping("/updateType")
    public String updateType(String userId, Integer userType, HttpSession session) {

        userService.updateType(userId, userType);

        return "redirect:/login.jsp";
    }

    /*** 更新状态
     * @author CloseEye
     */
    @RequestMapping("/updateState")
    public String updateState(String userId, Integer userState, HttpSession session) {

        userService.updateState(userId, userState);

        return "redirect:/login.jsp";
    }

}
