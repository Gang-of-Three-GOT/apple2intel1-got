package com.goteatfproject.appgot.dao;

import com.goteatfproject.appgot.vo.Notice;
import com.goteatfproject.appgot.vo.Party;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PartyDao {

  List<Party> findAll();

//  Party findByNo(int no);
//
//  int insert(Party board);

}