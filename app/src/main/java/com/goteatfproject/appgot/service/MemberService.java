package com.goteatfproject.appgot.service;

import com.goteatfproject.appgot.vo.User;
import java.util.List;

public interface MemberService {

  List<User> list() throws Exception;

}
