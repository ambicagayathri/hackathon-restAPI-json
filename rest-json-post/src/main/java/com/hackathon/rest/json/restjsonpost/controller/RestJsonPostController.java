package com.hackathon.rest.json.restjsonpost.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.rest.json.restjson.post.service.DetailsService;
import com.hackathon.rest.json.restjsonpost.model.Details;
import com.hackathon.rest.json.restjsonpost.model.DetailsResponse;

@RestController
public class RestJsonPostController {
	
	private DetailsService detailsService;
	
	@RequestMapping("/details")
	public ResponseEntity<DetailsResponse> getDetails(@RequestBody Details details) {
		detailsService = new DetailsService();
		
		if (detailsService.hasName(details.getName()) && detailsService.hasLanId(details.getLanId())) { 
			DetailsResponse resp = new DetailsResponse();
			resp.setMessage("Helloworld");
			
			return ResponseEntity.ok(resp);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}

}
