package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import entity.LibrarianBean;

@Repository
public class LibrarianDaoImp implements LibrarianDao {

	private static final String update = "update entity.LibrarianBean as lib set lib.name=?,lib.email=?,lib.password=?,lib.mobile=? where lib.id=?";
	private static final String view = "from entity.LibrarianBean";
	private static final String viewById = "from entity.LibrarianBean as lib where lib.id=?";
	private static final String delete = "delete from entity.LibrarianBean as lib where lib.id=?";
	private static final String authenticate = "from LibrarianBean as lib where lib.email=? and lib.password=?";

	@Autowired
	private HibernateTemplate temp;

	@Override
	public int save(LibrarianBean bean) {
		System.out.println("dao entered");

		int id = (Integer) temp.save(bean);
		return id;
	}

	@Override
	public int update(LibrarianBean bean) {
		int id = temp.bulkUpdate(update, bean.getName(), bean.getEmail(), bean.getPassword(), bean.getMobile(),
				bean.getId());
		return id;
	}

	@Override
	public List<LibrarianBean> view() {
		List<LibrarianBean> list = (List) temp.find(view);
		return list;
	}

	@Override
	public LibrarianBean viewById(int id) {
		List<LibrarianBean> list = (List) temp.find(viewById, id);
		for (LibrarianBean entity : list) {
			return entity;
		}
		return null;
	}

	@Override
	public int delete(int id) {

		int count = temp.bulkUpdate(delete, id);
		return count;

	}

	@Override
	public LibrarianBean authenticate(String email, String password) {

		List<LibrarianBean> list = (List) temp.find(authenticate, email, password);
		for (LibrarianBean entity : list) {
			return entity;
		}
		return null;

	}
}
