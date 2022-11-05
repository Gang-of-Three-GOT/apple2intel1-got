package com.goteatfproject.appgot.dao;

import com.goteatfproject.appgot.vo.Party;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PartyDao {

  int insert(Party party);
  List<Party> findAll();

  Party findByNo(int no);

} 

//
//  int insert(Party party);
//
//  Party findByNo(int no);
//
//  int update(Party party);
//
//  int delete(int no);
//
//  int deleteByMember(int memberNo);
//
//  List<Party> findAll();
//
//  int insertFiles(Party party);
//
//  AttachedFile findFileByNo(int fileNo);
//
//  List<AttachedFile> findFilesByParty(int partyNo);
//
//  int deleteFile(int fileNo);
//
//  int deleteFiles(int boardNo);
//
//  int deleteFilesByMemberPartys(int memberNo);
//}


