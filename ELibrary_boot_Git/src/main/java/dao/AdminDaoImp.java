package dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import dao.AdminDao;
import entity.AdminBean;

@Repository
public class AdminDaoImp implements AdminDao {
	@Autowired
	private HibernateTemplate template;
	private static final String hql = "from AdminBean as admin where admin.email=? and admin.password=?";

	public AdminBean authenticate(String email, String password) {

		List<AdminBean> list = (List) template.find(hql, email, password);
		for (AdminBean entity : list) {
			return entity;
		}
		return null;

	}
}