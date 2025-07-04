package com.woori.test_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String Home() {
		return "redirect:/question/list";
	}

}
