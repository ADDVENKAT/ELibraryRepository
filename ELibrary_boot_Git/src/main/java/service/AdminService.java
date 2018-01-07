package service;

import java.util.List;

import entity.AdminBean;

public interface AdminService {
	abstract boolean authenticate(String email, String password);

}
