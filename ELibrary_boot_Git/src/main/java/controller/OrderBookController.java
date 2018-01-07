package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import entity.BookBean;
import entity.OrderBookBean;
import service.BookService;

@RestController
public class OrderBookController {

	@Autowired
	BookService service;

	@RequestMapping(value = "/OrderBookForm", method = RequestMethod.GET)
	public ModelAndView orderBooksForm() {

		return new ModelAndView("orderBooks");
	}

	@RequestMapping(value = "/OrderBook", method = RequestMethod.POST)
	public ModelAndView orderBooks(HttpServletRequest req, HttpServletResponse res) {

		String isbno = req.getParameter("isbno");
		String name = req.getParameter("name");
		String author = req.getParameter("author");
		String publisher = req.getParameter("publisher");
		int quantity = Integer.parseInt(req.getParameter("quantity"));

		OrderBookBean bean = new OrderBookBean();
		bean.setIsbno(isbno);
		bean.setName(name);
		bean.setAuthor(author);
		bean.setPublisher(publisher);
		bean.setQuantity(quantity);

		String status = service.orderBooks(bean);

		return new ModelAndView("orderResult", "status", status);

	}

}
