package com.molt.front.main.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.molt.BaseController;


/**
 * 메인클래스
 * 
 * @author okssanta
 *
 */

@Controller
public class MainController extends BaseController {
	
	@Autowired 
	private Environment env;
	
	/**
	 * 메인화면
	 * 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/main.ok", method={RequestMethod.GET, RequestMethod.POST})
    public String main(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		return "front/main";
    }
}
