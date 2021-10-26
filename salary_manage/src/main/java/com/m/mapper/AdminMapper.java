package com.m.mapper;

import com.m.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {

    /***录入员工信息
     * @author CloseEye
     */
    @Insert("SELECT * FROM userinfo WHERE userId=#{userId} and password=#{password}")
    void insertUserInfo(User user);

}
