package com.niit.springcontroller;


	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	 
	@Controller
	
	public class HelloWorldController {
		@RequestMapping(value="/", method = RequestMethod.GET)
	    
	    public String sayHello( ) {
	        return "index";
	    }
	 
//	    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
//	    public String sayHelloAgain(ModelMap model) {
//	        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
//	        return "greeting";
//    }
//	 
	}


