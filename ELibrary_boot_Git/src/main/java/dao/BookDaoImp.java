package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import entity.BookBean;
import entity.IssueBookBean;
import entity.OrderBookBean;

@Repository
public class BookDaoImp implements BookDao {
	@Autowired
	private HibernateTemplate temp;
	private static final String viewIssuedBooks = "from entity.IssueBookBean";
	private static final String delete = "delete from BookBean as book where book.callno=?";
	private static final String bookIssued = "select * from BookBean as book where book.callno=?";
	private static final String checkIssued = "select * from BookBean as book where book.callno=?";
	private static final String view = "from entity.BookBean";
	private static final String returnBook = "update IssueBookBean as issueBook set issueBook.returnstatus='yes' where issueBook.callno=? and issueBook.studentid=?";
	private static final String search = "from BookBean as book where book.isbno=? and book.author=?";

	@Override
	public int save(BookBean bean) {
		int id = (Integer) temp.save(bean);
		return id;
	}

	@Override
	public List<BookBean> view() {
		List<BookBean> list = (List) temp.find(view);
		return list;
	}

	@Override
	public int delete(String callno) {
		int id = temp.bulkUpdate(delete, callno);
		return id;
	}

	@Override
	public int getIssued(String callno) {
		int id = 0;
		List<BookBean> list = (List) temp.find(bookIssued, callno);
		for (BookBean bean : list) {
			// id = bean.getIssued();
		}
		return id;
	}

	@Override
	public List<BookBean> checkIssue(String callno) {
		List<BookBean> list = (List) temp.find(checkIssued, callno);
		return list;
	}

	@Override
	public int issueBook(IssueBookBean bean) {
		System.out.println("entered dao");
		int id = (Integer) temp.save(bean);
		System.out.println("completed dao");
		return id;
	}

	@Override
	public int returnBook(String callno, int studentid) {
		int id = temp.bulkUpdate(returnBook, callno, studentid);
		return id;
	}

	@Override
	public List<IssueBookBean> viewIssuedBooks() {
		List<IssueBookBean> list = (List) temp.find(viewIssuedBooks);		
		return list;
	}

	@Override
	public int orderBooks(OrderBookBean bean) {
		int cnt = (Integer) temp.save(bean);
		return cnt;
	}

	@Override
	public List<BookBean> searchBook(String isbno, String author) {
		List<BookBean> list = (List) temp.find(search, isbno, author);
		for(BookBean bean:list){
			System.out.println(bean.getIsbno());
			System.out.println(bean.getAuthor());
		}
		return list;
	}

}
