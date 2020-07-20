package cn.toj.producer.mapper;

import cn.toj.producer.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    User selectByUsername(@Param("username") String username);

}
