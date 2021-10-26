package com.m.mapper;

import com.m.domain.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    /*** 根据用户工资号和密码查询用户
     * @author CloseEye
     */
    @Select("SELECT * FROM userinfo WHERE userId=#{userId} and password=#{password}")
     User findByUserIDAndPassword(@Param("userId") String userId, @Param("password") String password);

    /*** 设置户权限
     * @author CloseEye
     */
    @Update("UPDATE userinfo SET userType=#{userType} WHERE userId=#{userId}")
    void updateType(String userId,Integer userType);

    /*** 更新户状态
     * @author CloseEye
     */
    @Update("UPDATE userinfo SET userState=#{userState} WHERE userId=#{userId}")
    void updateState(String userId,Integer userState);

}
