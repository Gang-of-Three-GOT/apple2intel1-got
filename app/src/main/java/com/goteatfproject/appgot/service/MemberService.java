package com.goteatfproject.appgot.service;

import com.goteatfproject.appgot.vo.User;
import java.util.List;

public interface MemberService {

  void add(User user) throws Exception;

  User get(int no) throws Exception;

  User get(String email, String password) throws Exception;

  List<User> list() throws Exception;

}
