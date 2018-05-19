package com.example.demo.com.example.mapper;

import com.example.demo.com.example.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/6 上午11:00
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE ACCOUNT = #{account}")
    User findByName(@Param("account") String account);

    @Insert("INSERT INTO USER(ACCOUNT, PASSWORD) VALUES(#{account}, #{password})")
    int insert(@Param("account") String account, @Param("password") String password);

}
