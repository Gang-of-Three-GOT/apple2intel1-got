package com.goteatfproject.appgot.dao;

import com.goteatfproject.appgot.vo.Notice;
import com.goteatfproject.appgot.vo.Party;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PartyDao {

  List<Party> findAll();

  Party findByNo(int no);

  int insert(Party board);

  int update(Party board);

  int delete(int no);

//  int deleteByMember(int memberNo);

//  int insertFiles(Board board);
//
//  AttachedFile findFileByNo(int fileNo);
//
//  List<AttachedFile> findFilesByBoard(int boardNo);
//
//  int deleteFile(int fileNo);
//
//  int deleteFiles(int boardNo);
//
//  int deleteFilesByMemberBoards(int memberNo);
}