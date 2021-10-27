package com.m.controller;

import com.m.Bayesclass.BayesMain;
import com.m.domain.Recruit;
import com.m.domain.User;
import com.m.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

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
        User user = new User();
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
    public String RecruitInfo(Integer recruitID, String recruitName, String recruitInfo, HttpSession session) {


        Recruit recruit = new Recruit();
        recruit.setRecruitInfo(recruitInfo);
        recruit.setRecruitId(recruitID);
        recruit.setRecruitName(recruitName);
        recruitService.postRecruitInfo(recruit);
        return "redirect:/login.jsp";
    }

    /*** 发布招聘信息
     * @author CloseEye
     */
    @RequestMapping("/Judge")
    public String judge(String name, String isundergraduate, String isProjectexperience, String sex, String major) {

        ArrayList<String> testdata = new ArrayList<String>();
        testdata.add(isundergraduate);
        testdata.add(isProjectexperience);
        testdata.add(sex);
        testdata.add(major);
//        System.out.println("aaaaaaa1" + testdata.toString());
//
//        testdata.add("yes");
//        testdata.add("yes");
//        testdata.add("man");
//        testdata.add("finance");
        BayesMain bayesMain = new BayesMain();

        System.out.println(bayesMain.bayes(testdata));

        return "redirect:/login.jsp";
    }
}
