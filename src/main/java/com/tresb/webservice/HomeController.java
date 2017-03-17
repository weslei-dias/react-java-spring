package com.tresb.webservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weslei.dias
 */
@Controller
public class HomeController 
{
	@RequestMapping(value = "/")
	public String index() 
	{
		return "index";
	}
}
