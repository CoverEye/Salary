package com.m.service;

import com.m.domain.Recruit;
import com.m.domain.User;
import org.springframework.stereotype.Service;


public interface RecruitService {
    void postRecruitInfo(Recruit recruit);

   void updateGrade(User user);
}
