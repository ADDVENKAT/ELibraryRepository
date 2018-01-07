package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.BookBean;
import service.BookService;

@Controller
public class AddBookController {
	@Autowired
	BookService service;

	@RequestMapping(value = "/AddBookForm", method = RequestMethod.GET)
	public String addBookFormPage() {
		return "addBookForm";
	}

	@RequestMapping(value = "/AddBook", method = RequestMethod.POST)
	public String addBookForm(HttpServletRequest req, HttpServletResponse res) {

		
		String isbno = req.getParameter("isbno");
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String publisher = req.getParameter("publisher");
		int quantity = Integer.parseInt(req.getParameter("quantity"));

		BookBean bean = new BookBean();
		bean.setIsbno(isbno);
		bean.setName(name);
		bean.setAuthor(author);
		bean.setPublisher(publisher);
        bean.setQuantity(quantity);
        
		String status = service.save(bean);
        
		System.out.println(status);
		if (status != null) {
			if (status.equals("success")) {
				return "recordsInserted";
			} else if (status.equals("failure")) {
				return "recordsNotInserted";
			}

		}
		return "error";
	}

}
