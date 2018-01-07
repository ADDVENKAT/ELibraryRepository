package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.LibrarianBean;
import service.LibrarianService;

@Controller
public class ViewLibrarianController {
	@Autowired
	LibrarianService service;

	@RequestMapping(value = "/ViewLibrarian", method = RequestMethod.GET)
	public ModelAndView viewLibrarian() {

		List<LibrarianBean> list = service.view();
		return new ModelAndView("viewLibrarian", "list", list);

	}

}
