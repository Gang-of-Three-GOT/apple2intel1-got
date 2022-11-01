//package com.goteatfproject.appgot.web;
//
//import com.goteatfproject.appgot.service.NoticeService;
//import com.goteatfproject.appgot.service.PartyService;
//import com.goteatfproject.appgot.vo.Notice;
//import com.goteatfproject.appgot.vo.Party;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//@RequestMapping("/Party")
//public class PartyController {
//
//  PartyService partyService;
//
//  public PartyController(PartyService partyService) {
//    System.out.println("PartyController() 호출됨!");
//    this.partyService = partyService;
//  }
//
////  @GetMapping ("/add")
////  public String add() throws Exception {
////    return "member/form";
////  }
//
////  @PostMapping("/save")
////  public String save(User user) throws Exception {
////    return "memberInfo";
////  }
////
////  @PostMapping("/add")
////  public String add(User user) throws Exception {
////    memberService.add(user);
////    return "redirect:list";
////  }
//
//
//  @GetMapping("/list")
//  public String list(Model model) throws Exception {
//    model.addAttribute("parties", partyService.list());
//    return "party/list";
//  }
//
//  @GetMapping("/detail")
//  public Map detail(int no) throws Exception {
//    Party party  = partyService.get(no);
//    if (party == null) {
//      throw new Exception("해당 번호의 게시글이 없습니다");
//    }
//    Map map = new HashMap();
//    map.put("party", party);
//    return map;
//  }
//}
