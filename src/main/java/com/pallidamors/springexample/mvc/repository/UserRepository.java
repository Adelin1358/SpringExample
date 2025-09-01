package com.pallidamors.springexample.mvc.repository;

import com.pallidamors.springexample.mvc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface UserRepository {

    public int insertUser(
            @Param("name") String name
            ,@Param("birthday") String birthday
            ,@Param("email") String email
            , @Param("introduce") String introduce
    );

    public User selectLastUser();

}
