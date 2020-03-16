package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.bl.ProducerBl;

@Controller
public class HomeController {
	
	@Autowired
	ProducerBl producerBl;
	
	@RequestMapping("/loadMainPage")
	public String loadMainPage(Model model) {
		model.addAttribute("message");
		return "index";
	}
	
	@RequestMapping("/sendMessage")
	public String sendMessage(@RequestParam(name = "message") String message, Model model) throws Exception {
		producerBl.sendMessage(message);
		return "index";
	}

}
