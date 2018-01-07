package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.LibrarianBean;
import service.LibrarianService;

@Controller
public class AddLibrarianFormController {

	@Autowired
	private LibrarianService service;

	@RequestMapping(value = "/AddLibrarianPage", method = RequestMethod.GET)
	public String viewAddLibrarianController() {
		return "viewAddLibrarian";
	}

	@RequestMapping(value="/AddLibrarian",method=RequestMethod.POST)
	public String addLibrarianController(HttpServletRequest req,HttpServletResponse res) {
  
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		long mobile=Long.parseLong(req.getParameter("mobile"));
		
		LibrarianBean bean=new LibrarianBean();
		bean.setName(name);
		bean.setEmail(email);
		bean.setMobile(mobile);
		bean.setPassword(password);
        		
		String status = service.save(bean);
		if (status != null) {
			if (status.equals("success")) {
				return "librarianRecordsInserted";
			} else if (status.equals("failure")) {
				return "librarianNotFound";
			}

		}
		return "error";
	}
}
