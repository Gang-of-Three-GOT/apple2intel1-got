package com.goteatfproject.appgot.dao;

import com.goteatfproject.appgot.vo.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {

  List<User> findAll();

}
