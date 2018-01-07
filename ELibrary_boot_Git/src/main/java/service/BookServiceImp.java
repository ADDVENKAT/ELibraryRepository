package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.BookBean;
import entity.IssueBookBean;
import entity.OrderBookBean;
import dao.BookDao;

@Service
public class BookServiceImp implements BookService {
	@Autowired
	private BookDao dao;

	@Override
	@Transactional
	public String save(BookBean bean) {
		String status = "failure";
		try {
			int cnt = dao.save(bean);
			status = "success";
		} catch (Exception e) {
			status = "error";
		}
		return status;
	}

	@Override
	public List<BookBean> view() {
		return dao.view();
	}

	@Override
	public String delete(String callno) {
		String status = "Record deletion failed";
		try {
			int count = dao.delete(callno);
			status = "Record deleted sucessfully";
		} catch (Exception e) {
			status = "Unable to process your request!Please try again";
		}
		return status;

	}

	@Override
	public int getIssued(String callno) {
		return dao.getIssued(callno);
	}

	@Override
	public List<BookBean> checkIssue(String callno) {
		return dao.checkIssue(callno);
	}

	@Transactional
	@Override
	public String issueBook(IssueBookBean bean) {
		String status = "failure";
		try {
			int count = dao.issueBook(bean);
			if (count > 0) {
				status = "success";
			}
		} catch (Exception e) {
			status = "error";
		}
		return status;
	}

	@Override
	public String returnBook(String callno, int studentid) {
		String status = "Sorry, unable to return book.</h3><p>We may have sortage of books. Kindly visit later";
		try {
			int count = dao.returnBook(callno, studentid);
			status = "Book Returned Sucessfully";
		} catch (Exception e) {
			status = "Unable to process your request!Please try again";
		}
		return status;
	}

	@Override
	public List<IssueBookBean> viewIssuedBooks() {
		return dao.viewIssuedBooks();
	}

	@Transactional
	@Override
	public String orderBooks(OrderBookBean bean) {
		String msg = "Order not saved";
		try {
			int cnt = dao.orderBooks(bean);
			if (cnt > 0) {
				msg = "Order saved sucessfully";
			}
		} catch (Exception e) {
			msg = "Internal Server problem";
		}
		return msg;
	}

	@Override
	public List<BookBean> searchBook(String isbno, String author) {
		List<BookBean> list = dao.searchBook(isbno, author);
		return list;
	}

}
