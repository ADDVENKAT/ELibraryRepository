package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.IssueBookBean;
import service.BookService;

@Controller
public class ViewIssuedBookController {

	@Autowired
	BookService service;

	@RequestMapping(value = "/ViewIssuedBook", method = RequestMethod.GET)
	public ModelAndView viewBook() {
		List<IssueBookBean> list = service.viewIssuedBooks();
		if (list != null) {
			return new ModelAndView("viewIssuedBook", "list", list);
		}
		return new ModelAndView("error");

	}
}