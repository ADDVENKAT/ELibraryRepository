package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.LibrarianService;

@Controller
public class DeleteLibrarianController {
	@Autowired
	LibrarianService service;

	@RequestMapping(value = "/DeleteLibrarian", method = RequestMethod.GET)
	public String deleteLibrarian(HttpServletRequest req, HttpServletResponse res) {

		int id = Integer.parseInt(req.getParameter("id"));

		service.delete(id);

		return "deleteLibrarian";

	}

}
