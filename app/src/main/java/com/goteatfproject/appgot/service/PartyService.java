package com.goteatfproject.appgot.service;

import com.goteatfproject.appgot.vo.Party;
import java.util.List;

public interface PartyService {
//
  void add(Party party) throws Exception;

  List<Party> list() throws Exception;

  
  Party get(int no);
}

//
//  // 비즈니스 로직을 수행하는 객체의 사용규칙(호출규칙)
//  void add(Party party) throws Exception;
//
//  boolean update(Party party) throws Exception;
//
//  Party get(int no) throws Exception;
//
//  boolean delete(int no) throws Exception;
//
//  List<Party> list() throws Exception;
//
//  AttachedFile getAttachedFile(int fileNo) throws Exception;
//
//  boolean deleteAttachedFile(int fileNo) throws Exception;
//
//}
//







