package com.tresb.webservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author weslei.dias
 */
@Controller
@CrossOrigin(maxAge = 3600)
public class HomeController 
{
	@RequestMapping(value = "/", headers="*", method={RequestMethod.POST, 
			RequestMethod.GET, RequestMethod.OPTIONS}, produces="aplication/json")
	public String index() 
	{
		return "index";
	}
}
