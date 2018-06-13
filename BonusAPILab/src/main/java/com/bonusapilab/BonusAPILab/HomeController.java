package com.bonusapilab.BonusAPILab;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@ Controller
public class HomeController {

	@RequestMapping("/findfact")
	public ModelAndView fact (@RequestParam("month") String month, @RequestParam("day") String day) {
	ModelAndView mv = new ModelAndView();
	HttpHeaders headers = new HttpHeaders();
	headers.add("X-Mashape-Key", "ChmFXoDcxqmshFayxHuh5G0mDMrnp1aSoSIjsnEiVpg6COXZ8O");
	headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
	HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	RestTemplate restTemplate = new RestTemplate();
	ResponseEntity<Fact>response = restTemplate.exchange("https://numbersapi.p.mashape.com/" + month + "/" + day + "/date?fragment=true&json=true",
	HttpMethod.GET, entity, Fact.class);
	System.out.println(response.getBody);
	mv.addObject("test", response.getBody);
	
	return mv;
	}
	
}
