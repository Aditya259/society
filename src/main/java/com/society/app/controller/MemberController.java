package com.society.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.society.app.model.Member;
import com.society.app.repo.MemberRepo;

@RestController
public class MemberController {
	
	@Autowired
	MemberRepo memberRepo;

	@RequestMapping({ "/addMember" })
	public Member addMember(@RequestBody Member member) {
		//Member memberObject = new Member();
		Member memberObject = memberRepo.save(member);
		return memberObject;
	}
}
