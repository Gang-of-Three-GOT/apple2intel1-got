package com.goteatfproject.appgot.dao;

import com.goteatfproject.appgot.vo.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberDao {

  int insert(User user);

  User findByNo(int no);

  List<User> findAll();

  User findByEmailPassword(@Param("email") String email, @Param("password") String password);

}
