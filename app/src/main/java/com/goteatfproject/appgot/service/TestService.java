package com.goteatfproject.appgot.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.goteatfproject.appgot.dao.TestDao;
import com.goteatfproject.appgot.vo.Test;

// IOC 컨테이너에서 서비스를 관리할 수 있도록 어노테이션을 선언해주어야한다
@Service
public class TestService {

  @Autowired
  TestDao testDao;

  public void insert(Test t) throws Exception {
    System.out.println("tService:" + t);

    // 실무에서는 sql 사용
    Date nowDate = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss"); 
    String date = simpleDateFormat.format(nowDate); 
    System.out.println("포맷 지정 후 : " + date);

    t.setDate(date);
    System.out.println(t);

    // insert, delete, update = 결과값 int형
    System.out.println("db:"+ testDao.insert(t));
  }

  public List<Test> findAll() throws Exception {
    return testDao.findAll();
  }

}
