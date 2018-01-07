package service;

import java.util.List;

import entity.LibrarianBean;

public interface LibrarianService {
	abstract String save(LibrarianBean bean);

	abstract String update(LibrarianBean bean);

	abstract List<LibrarianBean> view();

    abstract  LibrarianBean viewById(int id);

	abstract int delete(int id);

	abstract boolean authenticate(String email, String password);

}
