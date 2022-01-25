package mes.com.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test1")
	public String test1() {
		return "test/test1";
	}
	
	@RequestMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("datas", Arrays.asList("a", "b", "c"));
		return "jsonView"; //BeanNameViewResolver
	}
	
	@RequestMapping("/test3")
	public String test3(Model model) {
		model.addAttribute("msg", "메시지");
		model.addAttribute("url", "test1");
		return "msgView"; 
	}
}
