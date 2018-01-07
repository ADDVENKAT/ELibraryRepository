package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.LibrarianBean;
import dao.LibrarianDao;
@Service
public class LibrarianServiceImp implements LibrarianService {
	@Autowired
	private LibrarianDao dao;

	@Override
	@Transactional
	public String save(LibrarianBean bean) {
		String status = "failure";
		try {
			int count = dao.save(bean);
	     	status = "success";
		} catch (Exception e) {
			status = "server_error";
		}
		return status;

	}

	@Override
	public String update(LibrarianBean bean) {
		String status = "Librarian updation failure";
		try {
			int count = dao.update(bean);
			status = "Librarian updated sucessfully";
		} catch (Exception e) {
			status = "Unable to process your request!Please try again";
		}
		return status;
	}

	@Override
	public List<LibrarianBean> view() {
		return dao.view();
	}

	@Override
	public int delete(int id) {
		int count=0;
		try {
		 count= dao.delete(id);
    		} catch (Exception e) {
    			e.getMessage();
		}
        return count;
	}

	@Override
	public LibrarianBean viewById(int id) {
		return dao.viewById(id);
	}

	@Override
	public boolean authenticate(String email, String password) {
		boolean status = false;
		LibrarianBean bean = dao.authenticate(email, password);
        if(bean!=null){
		if (email.equals(bean.getEmail()) && password.equals(bean.getPassword())) {
			status = true;
		}
       }
		return status;

	}

}
