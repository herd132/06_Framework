package edu.kh.test.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.kh.test.member.model.dto.Member;
import edu.kh.test.member.model.service.MemberService;
import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {
	
	private final MemberService service;
	
	@ResponseBody
	@GetMapping("selectAllList")
	public List<Member> selectAllList() {
		return service.selectAllList();
		
		
		
	}
	

	
}
