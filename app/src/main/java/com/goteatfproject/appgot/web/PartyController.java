//package com.goteatfproject.appgot.web;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//@RequestMapping("/party")
//public class PartyController {
//
//  @GetMapping("/list")
//  public String list(Model model) throws Exception {
//    model.addAttribute("parties", partyService.list());
//    return "board/partyList";
//  }
//
////  @GetMapping("/detail")
////  public Map detail(int no) throws Exception {
////    Party party  = partyService.get(no);
////    if (party == null) {
////      throw new Exception("해당 번호의 게시글이 없습니다");
////    }
////    Map map = new HashMap();
////    map.put("party", party);
////    return map;
////  }
//}
