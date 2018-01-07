package dao;

import java.util.List;

import entity.BookBean;
import entity.IssueBookBean;
import entity.OrderBookBean;

public interface BookDao {
    abstract int save(BookBean bean);
    abstract  List<BookBean> view();
    abstract int delete(String callno);
    abstract int getIssued(String callno);
    abstract List<BookBean> checkIssue(String callno);
    abstract int issueBook(IssueBookBean bean);
    abstract int returnBook(String callno,int studentid);
    abstract List<IssueBookBean> viewIssuedBooks();
    abstract int orderBooks(OrderBookBean bean);
    abstract List<BookBean> searchBook(String isbno,String author);
}
