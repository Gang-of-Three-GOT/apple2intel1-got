package com.goteatfproject.appgot.service;

import com.goteatfproject.appgot.vo.Notice;
import com.goteatfproject.appgot.vo.Party;

import java.util.List;

public interface PartyService {

  List<Party> list() throws Exception;

  Party get(int no) throws Exception;

}