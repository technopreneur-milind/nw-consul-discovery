package com.technopreneur.milind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class Controller {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{key}")
	public String getValue(@PathVariable String key) {
		return restTemplate.exchange("http://consulserver/server/{key}", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
		}, key).getBody();
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
