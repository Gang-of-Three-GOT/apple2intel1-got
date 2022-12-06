package com.goteatfproject.appgot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.goteatfproject.appgot.vo.Test;

@Mapper
public interface TestDao {

  int insert(Test t);

  List<Test> findAll();
}
