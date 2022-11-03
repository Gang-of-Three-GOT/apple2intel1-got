package com.goteatfproject.appgot.web;

import com.goteatfproject.appgot.service.PartyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class MyController {

  PartyService partyService;

  public MyController(PartyService partyService) {
    this.partyService = partyService;
  }

  // 마이페이지
  @GetMapping("/main")
  public String myPage() throws Exception {
    // model.addAttribute("parties", myPageService.list());
    return "mypage/myPartyList";
  }

  // 마이페이지
  @GetMapping("/myPartyList")
  public String myPartylist(Model model) throws Exception {
    model.addAttribute("parties", partyService.list());
    return "mypage/myPartyList";
  }

}
