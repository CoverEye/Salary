package com.m.mapper;

import com.m.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    /*** 根据用户工资号和密码查询用户
     * @author CloseEye
     */
    @Select("SELECT * FROM userinfo WHERE userId=#{userId} and password=#{password}")
    public User findByUserIDAndPassword(@Param("userId") String userId, @Param("password") String password);


}
