package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.BookBean;
import service.BookService;

@Controller
public class ViewBookController {
	@Autowired
	BookService service;

	@RequestMapping(value = "/ViewBook", method = RequestMethod.GET)
	public ModelAndView viewBook() {
		List<BookBean> list = service.view();
		return new ModelAndView("viewBook", "list", list);
	}
}
