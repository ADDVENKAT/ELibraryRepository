package service;

import java.util.List;

import entity.BookBean;
import entity.IssueBookBean;
import entity.OrderBookBean;

public interface BookService {
	abstract String save(BookBean bean);
    abstract  List<BookBean> view();
    abstract String delete(String callno);
    abstract int getIssued(String callno);
    abstract List<BookBean> checkIssue(String callno);
    abstract String issueBook(IssueBookBean bean);
    abstract String returnBook(String callno,int studentid);
    abstract List<IssueBookBean> viewIssuedBooks();
    abstract String orderBooks(OrderBookBean bean);
    abstract List<BookBean> searchBook(String isbno,String author);
}
