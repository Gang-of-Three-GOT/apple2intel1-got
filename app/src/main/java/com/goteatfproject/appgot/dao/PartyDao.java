package com.goteatfproject.appgot.dao;

import com.goteatfproject.appgot.vo.Party;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PartyDao {

  int insert(Party party);

  int insertFiles(Party party);
  List<Party> findAll();
  Party findByNo(int no);
  int update(Party party);
  int delete(int no);

}