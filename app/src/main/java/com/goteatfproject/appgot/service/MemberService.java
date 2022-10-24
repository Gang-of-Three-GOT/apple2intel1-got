package com.goteatfproject.appgot.service;

import com.goteatfproject.appgot.vo.User;
import java.util.List;

public interface MemberService {

  void add(User user) throws Exception;

  List<User> list() throws Exception;

}
