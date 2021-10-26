package com.m.mapper;

import com.m.domain.Recruit;
import com.m.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface RecruitMapper {

    /***发布招聘信息
     * @author CloseEye
     */
    @Insert("INSERT INTO recruit " +
            "SET recruitId = #{recruitId}," +
            "recruitName = #{recruitName}," +
            "recruitInfo = #{recruitInfo}")
    void postRecruitInfo(Recruit recruit);

    /***上传成绩
     * @author CloseEye
     */
    @Update("UPDATE userinfo SET grade=#{grade} WHERE probation#{probation}")
    void updateGrade(User user);

}
