package com.xworkz.registercheck.daoimpl;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.xworkz.registercheck.dao.RegisterDAO;
import com.xworkz.registercheck.dto.RegisterDTO;
import com.xworkz.sessionFactory.SingleFactory;

public class RegisterDAOImpl implements RegisterDAO {
	@Override
	public void saveUserDetails(RegisterDTO registerDTO) {
		System.out.println("invoked save User Details");
		Session session = null;
		Transaction transaction = null;
		try {
			SessionFactory factory = SingleFactory.getSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			session.save(registerDTO);
			session.getTransaction().commit();
			System.out.println("saved");
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			System.out.println("wrong");
		} finally {
			try {
				if (Objects.nonNull(session)) {
					session.close();
					System.out.println("session close");
				} else {
					System.out.println("not close");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
