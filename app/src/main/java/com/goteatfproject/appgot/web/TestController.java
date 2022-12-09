package com.goteatfproject.appgot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.goteatfproject.appgot.service.TestService;
import com.goteatfproject.appgot.vo.Test;

@Controller
@RequestMapping("/test")
public class TestController {

  @Autowired
  TestService testService;

  @GetMapping("/list")
  public String testList(Model model) throws Exception {
    System.out.println("testCheckController 실행");
    testService.findAll();
    System.out.println("testListController data확인:" + testService.findAll());
    System.out.println("testListController dataSize확인:" + testService.findAll().size());

    model.addAttribute("tf", testService.findAll());

    return "test/testList";
  }

  // 추가 될때마다 매개변수를 추가시켜줘야함=> 유지보수 어려움 => vo 객체에 담는 이유
  //  @GetMapping("/add")
  //  public String insert(String title, String content, String writer) {
  //    System.out.println(title);
  //    System.out.println(content);
  //    System.out.println(writer);
  //    return "test/testList";
  //  }

  @GetMapping("/add")
  public String insert(Test t) throws Exception {
    System.out.println("insertController data확인:"+ t);

    // 인스터스화 : 인스턴스 생성 - 스프링이 대신 해줌(Bean 등록을 해줘야) -> @Service
    // @Autowired 사용하여 자동 생성자를 만들어서 바로 사용 가능
    // TestService testService = new TestService(); 
    testService.insert(t);

    return "redirect:list";
  }

  @GetMapping("/form")
  public String form() throws Exception {

    return "test/testForm";
  }

  @GetMapping("/test-detail")
  public ModelAndView detail(int no) {
    System.out.println("detailController data확인:" + no);

    // ModelAndView는 컨테이너가 관리하지 않기 때문에 직접 인스턴스객체를 만들어서 리턴해야한다
    // "test/testDetail" =viewName 에 해당
    ModelAndView mv = new ModelAndView("test/testDetail");
    // 메서드 선언 후 서비스로 호출
    testService.detail(no);
    System.out.println("출력 확인:" + testService.detail(no));
    mv.addObject("tfd", testService.detail(no));
    return mv;
  }

  @PostMapping("/update")
  public String update(Test test) {
    System.out.println("updateController 실행");
    System.out.println("update+test:" + test);
    //    return "redirect:test-detail?no=1";
    testService.update(test);
    return "redirect:test-detail?no=" + test.getNo();
  }

  @PostMapping("/remove")
  public String remove(int no) {
    System.out.println("removeController 실행");
    testService.remove(no);
    return "redirect:list";
  }

}