package com.goteatfproject.appgot.web;

import com.goteatfproject.appgot.service.FeedService;
import com.goteatfproject.appgot.service.NoticeService;
import com.goteatfproject.appgot.vo.AttachedFile;
import com.goteatfproject.appgot.vo.Feed;
import com.goteatfproject.appgot.vo.Member;
import com.goteatfproject.appgot.vo.Notice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/feed")
public class FeedController {

  ServletContext sc;
  FeedService feedService;

  public FeedController(FeedService feedService, ServletContext sc) {
    System.out.println("FeedController() 호출됨!");
    this.feedService = feedService;
  }

  @GetMapping("/list")
  public String list(Model model) throws Exception {
    model.addAttribute("feeds", feedService.list());
    return "feed/Feed";
  }

  @GetMapping("/form")
  public void form() throws Exception {
  }

  @PostMapping("/form")
  public String add(Feed feed, HttpSession session) throws Exception {

    feed.setWriter((Member) session.getAttribute("loginMember"));

    feedService.add(feed);
    return "feed/Feed";
  }



}
