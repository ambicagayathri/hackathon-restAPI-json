package com.hackathon.rest.json.restjsonpost.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.rest.json.restjsonpost.model.Members;

@RestController
public class TeamController {

	@RequestMapping(value = "/members", method = RequestMethod.GET)
	public ResponseEntity<List<Members>> listMembers() {

		Members mem1 = new Members("Ambica", 123);
		Members mem2 = new Members("Brunda", 234);
		Members mem3 = new Members("Preyansh", 456);
		Members mem4 = new Members("Siddharth", 567);

		List<Members> memberList = new ArrayList<>();
		memberList.add(mem1);
		memberList.add(mem2);
		memberList.add(mem3);
		memberList.add(mem4);
		return ResponseEntity.ok(memberList);
	}
}
