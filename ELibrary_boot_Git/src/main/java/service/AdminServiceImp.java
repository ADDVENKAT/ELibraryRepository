package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdminDao;
import entity.AdminBean;
@Service
public class AdminServiceImp implements AdminService {
   
	@Autowired
	private AdminDao dao;
	
	
	@Override
	public boolean authenticate(String email, String password) {
        boolean status=false;
		AdminBean bean=dao.authenticate(email, password);
		if(bean!=null){
		if(email.equals(bean.getEmail()) && password.equals(bean.getPassword())){
			status=true;
		}
		}
		
		return status;
		
	}

}
