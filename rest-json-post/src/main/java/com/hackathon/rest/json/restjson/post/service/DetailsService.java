package com.hackathon.rest.json.restjson.post.service;

public class DetailsService {
	
	public boolean hasName(String name) {
		if(name.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public boolean hasLanId(String lanId) {
		if(lanId.isEmpty()) {
			return false;
		}
		return true;
	}

}
