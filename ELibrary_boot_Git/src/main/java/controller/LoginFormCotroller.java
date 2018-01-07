package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Utils.MyLoggers;
import service.AdminService;
import service.LibrarianService;

@Controller
public class LoginFormCotroller {

	@Autowired
	AdminService service;
	@Autowired
	LibrarianService libservice;
    
	@RequestMapping(value = "/Index", method = RequestMethod.GET)
	public String home(){
		return "index";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
	public String showAdminPage(@RequestParam String email, @RequestParam String password, HttpServletRequest req,
			HttpServletResponse res) {
        MyLoggers.logger.debug("entered into admin controller");
		boolean isValid = service.authenticate(email, password);
		HttpSession ses = req.getSession();
		if (isValid) {
			ses.setAttribute("admin", "true");
			return "AdminLogin";
		}
		
		ses.setAttribute("admin","false");
		MyLoggers.logger.debug("exit  from admin controller");
		return "index";
	}

	@RequestMapping(value = "/librarianlogin", method = RequestMethod.POST)
	public String showLibrarianPage(@RequestParam String email, @RequestParam String password, HttpServletRequest req,
			HttpServletResponse res) {

		boolean isValidUser = libservice.authenticate(email, password);
		HttpSession ses = req.getSession();
		if (isValidUser) {
			ses.setAttribute("user", "true");
			return "LibrarianLogin";
		}
		ses.setAttribute("user","false");
		return "index";
	}

}
