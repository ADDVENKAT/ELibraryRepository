package dao;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

import entity.AdminBean;

public interface AdminDao {

	abstract AdminBean authenticate(String email, String password);

}
