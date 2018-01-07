package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.LibrarianBean;
import service.LibrarianService;

@Controller
public class EditLibrarianController {

	@Autowired
	private LibrarianService service;

	@RequestMapping(value = "/EditLibrarianForm", method = RequestMethod.GET)
	public ModelAndView editLibrarianForm(HttpServletRequest req, HttpServletResponse res) {

		int id = Integer.parseInt(req.getParameter("id"));
		LibrarianBean bean = service.viewById(id);
		return new ModelAndView("editLibrarianForm", "bean", bean);

	}

	@RequestMapping(value = "/EditLibrarian", method = RequestMethod.POST)
	public String editLibrarian(HttpServletRequest req, HttpServletResponse res) {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		long mobile = Long.parseLong(req.getParameter("mobile"));
		LibrarianBean bean = new LibrarianBean(id, name, email, password, mobile);
		service.update(bean);
		return "redirect:/ViewLibrarian";
	
	}

}
