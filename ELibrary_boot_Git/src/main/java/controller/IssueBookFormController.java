package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.IssueBookBean;
import service.BookService;

@Controller
public class IssueBookFormController {
	@Autowired
	BookService service;

	@RequestMapping(value = "/IssueBookForm", method = RequestMethod.GET)
	public String issueBookForm() {

		return "issueBookForm";

	}

	@RequestMapping(value = "/IssueBook", method = RequestMethod.POST)
	public String issueBook(HttpServletRequest req, HttpServletResponse res) {

		String isbno = req.getParameter("isbno");
		String studentid = req.getParameter("studentid");
		String studentname = req.getParameter("studentname");
		long studentmobile = Long.parseLong(req.getParameter("studentmobile"));

		Date date = null;
		try {
			date = new SimpleDateFormat("dd-MM-yyyy").parse(req.getParameter("issueddate"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		IssueBookBean bean = new IssueBookBean();
		bean.setIsbno(isbno);
		bean.setStudentid(studentid);
		bean.setStudentname(studentname);
		bean.setStudentmobile(studentmobile);
		bean.setIssueddate(date);

		String status = service.issueBook(bean);

		HttpSession ses = req.getSession();

		if (status.equals("success")) {
			ses.setAttribute("issuebook", "true");
			return "issueBook";
		}

		return "error";

	}

}
