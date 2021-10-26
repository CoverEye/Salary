package com.m.service.impl;

import com.m.domain.Recruit;
import com.m.domain.User;
import com.m.mapper.RecruitMapper;
import com.m.mapper.SalaryMapper;
import com.m.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecruitServiceImpl implements RecruitService {

    @Autowired
    private RecruitMapper recruitMapper;

    @Override
    public void postRecruitInfo(Recruit recruit) {
        recruitMapper.postRecruitInfo(recruit);
    }

    @Override
    public void updateGrade(User user) {
        recruitMapper.updateGrade(user);

    }
}
