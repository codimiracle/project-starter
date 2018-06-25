package com.codimiracle.web.sample.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

	@RequestMapping(path = "/say", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> hello() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "Codimiracle");
		return map;
	}
}
