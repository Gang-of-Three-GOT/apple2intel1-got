package com.goteatfproject.appgot.web;

import com.goteatfproject.appgot.service.PartyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//  @GetMapping("/")
//  public String home() {
//    return "index";
//  }

  PartyService partyService;

  public HomeController(PartyService partyService) {
    this.partyService = partyService;
  }

  @GetMapping("/")
  public String home(Model model) throws Exception {
    model.addAttribute("parties", partyService.list());
    return "index";
  }
}
