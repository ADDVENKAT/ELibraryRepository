package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutController {

	@RequestMapping(value = "/LogoutAdmin", method = RequestMethod.GET)
	public String logoutAdmin(HttpServletRequest req, HttpServletResponse res) {

		HttpSession session = req.getSession();
		session.invalidate();

		return "index";

	}

	@RequestMapping(value = "/LogoutLibrarian", method = RequestMethod.GET)
	public String logoutLibrarian(HttpServletRequest req, HttpServletResponse res) {

		HttpSession session = req.getSession();
		session.invalidate();

		return "index";

	}

}
