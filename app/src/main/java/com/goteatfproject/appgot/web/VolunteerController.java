package com.goteatfproject.appgot.web;

import com.goteatfproject.appgot.service.MemberService;
import com.goteatfproject.appgot.service.PartyService;
import com.goteatfproject.appgot.service.VolunteerService;
import com.goteatfproject.appgot.vo.Member;
import com.goteatfproject.appgot.vo.Party;
import com.goteatfproject.appgot.vo.Volunteer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/volunteer/")
public class VolunteerController {

  MemberService memberService;
  PartyService partyService;
  VolunteerService volunteerService;

  public VolunteerController(MemberService memberService, PartyService partyService,
      VolunteerService volunteerService) {
    System.out.println("VolunteerController() 호출됨!!");
    this.memberService = memberService;
    this.partyService = partyService;
    this.volunteerService = volunteerService;
  }

  // 파티 참여
  @PostMapping("add")
  @ResponseBody
  public String volunteerAdd(Model model,
      HttpSession session, @RequestBody Volunteer volunteer) throws Exception {
    System.out.println("state값 = " + volunteer.getState());
    System.out.println("url값 = " + volunteer.getUrlNo());

    // 파티 번호를 가져와서 해당 번호로 게시물 상세조회 실행 => 리밋, 맥스 가져와서 if문 돌리기
    Party par = (Party) partyService.get(volunteer.getUrlNo());
    System.out.println("parLi ========> " + par.getLimit());
    System.out.println("parNa ========> " + par.getMax());

    int lit = par.getLimit();
    int max = par.getMax();
    // 게시물 넘버의 리밋 맥스 가져와서 비교
//    volunteerService.get2(volunteer.getUrlNo());
//    int lit = par.getPart().getLimit();
//    int max = par.getPart().getMax();
//
//    System.out.println("lit =======> " + lit);
//    System.out.println("lit =======> " + max);

//    int no = volunteer.getUrlNo();
    // vno=pno, mno, date 는 nn ,, state, etc는 null
    if (lit != max) {
      checkOwner(volunteer.getUrlNo(), session); // 작성자는 신청불가
      volunteer.setWriter((Member) session.getAttribute("loginMember"));
      System.out.println("sessionId = " + volunteer.getWriter());
      // 파티 참여
      volunteerService.partyJoin(volunteer);

      // 파티 참여 카운트
      volunteerService.partyJoinCount(volunteer);
      boolean state = volunteer.getState();
      if (state) {
        return "1"; // ajax 미정
      }
      return "0"; // ajax 성공
    }
      return "3"; // ajax 인원초과
  }


  @GetMapping("list")
  public String volunteerList(Model model, Volunteer volunteer) throws Exception {

//    for (int i = 0; i < volunteer.getNo_list().length; i++) {
//      volunteer.getNo(volunteer.getNo_list()[i]);
//      volunteerService.list(volunteer);
//    }
//    System.out.println("volunteer = " + volunteer);
//
//    List<Volunteer> volList = volunteerService.list();
//
//    System.out.println("volList = " + volList);

//    List<Volunteer> volunteers = new ArrayList<>();

    model.addAttribute("volList", volunteerService.list());
//    System.out.println("model.getAttribute(\"volList\") =  " + model.getAttribute("volList"));
    // 히든으로 no - 당겨오기 - 디테일처럼 출력
    return "volunteer/volunteerList";
  }

  @GetMapping("detail")
  public Map detail(int no) throws Exception {
    List<Volunteer> volunteers = volunteerService.get(no);

    if (volunteers == null) {
      throw new Exception("해당 파티의 참여자가 아닙니다!");
    }

    Map map = new HashMap<>();
    map.put("volunteers", volunteers);
    System.out.println("mapvolunteer = " + map);
    return map;
  }

  // 파티 리스트
//  @GetMapping("list")
//  public String partyList(Model model) throws Exception {
//    model.addAttribute("parties", partyService.list());
//    return "party/partyList";
//  }

//    boolean st = volunteer.getState();

    // 파티정보 & 참여자가 넘어온다.
//    int pno = party.getNo();
//    int mno = member.getNo();
//    String id = member.getId();
//    String password = member.getPassword();
//
//    member = memberService.get(mno);
//    party = partyService.get(pno);
//
//    if (member != null) {
//      session.setAttribute("loginMember", member);
//    }
    // 파티 & 참여자 정보를 보낸다.

    // --> 어디로 ? db로

//    if (member == null) {
//      return "false";
//    }
//    return "true";
//  }

  private void checkOwner(int partyNo, HttpSession session) throws Exception {
    Member loginMember = (Member) session.getAttribute("loginMember");
    // 개인이해메모
    // getWriter().getNo() != loginMember.getNo() // 로그인 멤버no 꺼내서 party에 있는 Member writer 이용해서 일치여부 확인
    // 방향 ----->
    System.out.println("partyNo = " + partyNo);

    if (partyService.get(partyNo).getWriter().getNo() == loginMember.getNo()) {
      throw new Exception("작성자는 신청 불가");
    }
    //volunteer에서 no를 꺼내와 겟라이터.겟넘버 == 로그인멤버.넘버와 일치하면 중복 신청 불가능
  }

}
