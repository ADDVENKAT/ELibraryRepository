package dao;

import java.util.List;

import entity.LibrarianBean;

public interface LibrarianDao {

	    abstract  int save(LibrarianBean bean);
		abstract int update(LibrarianBean bean);
		abstract  List<LibrarianBean> view();
		abstract  LibrarianBean viewById(int id);
        abstract  int delete(int id);
        abstract  LibrarianBean authenticate(String email,String password);	
}
