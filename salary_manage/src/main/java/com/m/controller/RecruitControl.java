package com.m.controller;

import com.m.domain.Recruit;
import com.m.domain.User;
import com.m.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
@Controller
public class RecruitControl {

    @Autowired
    private RecruitService recruitService;

    /*** 更新成绩
     * @author CloseEye
     */
    @RequestMapping("/UpdateGrade(")
    public String updateGrade(String userId,
                              Integer grade,
                              Integer probation, HttpSession session) {
        User user=new User();
        user.setUserId(userId);
        user.setGrade(grade);
        user.setProbation(probation);
        recruitService.updateGrade(user);

        return "redirect:/login.jsp";
    }
    /*** 发布招聘信息
     * @author CloseEye
     */
    @RequestMapping("/RecruitInfo")
    public String RecruitInfo(Integer recruitID,String recruitName,String recruitInfo, HttpSession session) {


        Recruit recruit =new Recruit();
        recruit.setRecruitInfo(recruitInfo);
        recruit.setRecruitId(recruitID);
        recruit.setRecruitName(recruitName);
        recruitService.postRecruitInfo(recruit);
        return "redirect:/login.jsp";
    }
}
