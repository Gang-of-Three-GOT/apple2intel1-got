package com.goteatfproject.appgot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.goteatfproject.appgot.service.PartyService;

@Controller
@RequestMapping("/board")
public class BoardController {

  PartyService partyService;

  public BoardController(PartyService partyService) {
    System.out.println("BoardController() 호출됨!!");
    this.partyService = partyService;
  }

  //  @GetMapping("/list")
  //  public String list() {
  //    return "board/boardList";
  //  }

  // 파티 리스트
  @GetMapping("/partyList")
  public String list(Model model) throws Exception {
    model.addAttribute("parties", partyService.list());
    return "board/partyList";
  }


}
