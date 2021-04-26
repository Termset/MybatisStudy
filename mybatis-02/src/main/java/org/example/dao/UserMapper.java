package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

    @Select(("select"))
    User getUserById(@Param("id") int id,@Param("name") String name);
}
