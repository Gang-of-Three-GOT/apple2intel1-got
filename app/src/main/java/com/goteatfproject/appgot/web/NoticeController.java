package com.goteatfproject.appgot.web;

import com.goteatfproject.appgot.service.MemberService;
import com.goteatfproject.appgot.service.NoticeService;
import com.goteatfproject.appgot.vo.Notice;
import com.goteatfproject.appgot.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/notice")
public class NoticeController {

  NoticeService noticeService;

  public NoticeController(NoticeService noticeService) {
    System.out.println("NoticeController() 호출됨!");
    this.noticeService = noticeService;
  }

//  @GetMapping ("/add")
//  public String add() throws Exception {
//    return "member/form";
//  }

//  @PostMapping("/save")
//  public String save(User user) throws Exception {
//    return "memberInfo";
//  }
//
//  @PostMapping("/add")
//  public String add(User user) throws Exception {
//    memberService.add(user);
//    return "redirect:list";
//  }


  @GetMapping("/list")
  public String list(Model model) throws Exception {
    model.addAttribute("notices", noticeService.list());
    return "notice/list";
  }

  @GetMapping("/detail")
  public Map detail(int no) throws Exception {
    Notice notice  = noticeService.get(no);
    if (notice == null) {
      throw new Exception("해당 번호의 게시글이 없습니다");
    }
    Map map = new HashMap();
    map.put("notice", notice);
    return map;
  }
}
