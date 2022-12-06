package com.goteatfproject.appgot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.goteatfproject.appgot.service.TestService;
import com.goteatfproject.appgot.vo.Test;

@Controller
@RequestMapping("/test")
public class TestController {

  @Autowired
  TestService testService;

  @GetMapping("/list")
  public String testList() throws Exception {
    System.out.println("testCheck");
    testService.findAll();
    System.out.println("data 확인" + testService.findAll());
    System.out.println("data 확인" + testService.findAll().size());
    return "test/testList";
  }

  //  @GetMapping("/add")
  //  public String insert(String title, String content, String writer) {
  //    System.out.println(title);
  //    System.out.println(content);
  //    System.out.println(writer);
  //    return "test/testList";
  //  }

  @GetMapping("/add")
  public String insert(Test t) throws Exception {
    System.out.println(t);

    // 인스터스화 : 인스턴스 생성 - 스프링이 대신 해줌(Bean 등록을 해줘야) -> @Service
    // @Autowired 사용하여 자동 생성자를 만들어서 바로 사용 가능
    // TestService testService = new TestService(); 
    testService.insert(t);

    return "test/testList";
  }

}