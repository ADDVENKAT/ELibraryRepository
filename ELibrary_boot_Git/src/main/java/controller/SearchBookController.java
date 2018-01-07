package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.BookBean;
import service.BookService;

@Controller
public class SearchBookController {

	@Autowired
	BookService service;

	@RequestMapping(value = "/SearchBook", method = RequestMethod.GET)
	public String searchBookForm() {
		return "searchBookForm";
	}

	@RequestMapping(value = "/SearchBookForm", method = RequestMethod.POST)
	public ModelAndView searchBook(HttpServletRequest req, HttpServletResponse res) {

		String isbno = req.getParameter("isbno");
		String author = req.getParameter("author");
		List<BookBean> list = service.searchBook(isbno, author);
		return new ModelAndView("searchBook", "list", list);

	}

}
