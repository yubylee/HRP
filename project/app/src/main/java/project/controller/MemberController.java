package project.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.service.MemberService;
import project.vo.Member;
import util.RestResult;
import util.RestStatus;

@RestController
@RequestMapping("/members")
public class MemberController {

  Logger log = LogManager.getLogger(getClass());

  @Autowired private MemberService memberService;

  @PostMapping
  public Object insert(@RequestBody Member member) {
    memberService.add(member);
    System.out.println("받음");
    return new RestResult()
        .setStatus(RestStatus.SUCCESS);

  }

}
