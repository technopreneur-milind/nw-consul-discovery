package com.technopreneur.milind;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class Controller {

	@GetMapping("/{key}")
	public String getValue(@PathVariable String key) {

		return key.toUpperCase();
	}

}
