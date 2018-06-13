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

import com.bonusapilab.BonusAPILab.entity.Fact;
import com.bonusapilab.BonusAPILab.entity.FactType;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView index () {
		return new ModelAndView ("index", "testing", "HELLO WORLD");
	}
	
	@RequestMapping("/findfact")
	public ModelAndView fact (@RequestParam("month") String month, @RequestParam("day") String day) {
	ModelAndView mv = new ModelAndView("showfact");
	HttpHeaders headers = new HttpHeaders();
	headers.add("X-Mashape-Key", "ChmFXoDcxqmshFayxHuh5G0mDMrnp1aSoSIjsnEiVpg6COXZ8O");
	headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
	HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	RestTemplate restTemplate = new RestTemplate();
	ResponseEntity<Fact>response = restTemplate.exchange("https://numbersapi.p.mashape.com/" + month + "/" + day + "/date?fragment=true&json=true",
	HttpMethod.GET, entity, Fact.class);
	System.out.println(response.getBody());
	mv.addObject("fact", response.getBody());	
	return mv;
	}
	@RequestMapping("/facttype")
	public ModelAndView findFactType(@RequestParam("facttype")String facttype) {
		ModelAndView mv = new ModelAndView("showfact");
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Mashape-Key", "ChmFXoDcxqmshFayxHuh5G0mDMrnp1aSoSIjsnEiVpg6COXZ8O");
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<FactType>response = restTemplate.exchange("https://numbersapi.p.mashape.com/random/" + facttype + "?fragment=true&json=true&max=20&min=10",
				HttpMethod.GET, entity, FactType.class);
		System.out.println(response.getBody());
		mv.addObject("facttype", response.getBody());		
		return mv;
	}
}
