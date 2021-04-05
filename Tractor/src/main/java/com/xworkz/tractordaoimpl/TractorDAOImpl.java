package com.xworkz.tractordaoimpl;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.tractordao.TractorDAO;
import com.xworkz.tractordto.TractorDTO;

public class TractorDAOImpl implements TractorDAO {

	private SessionFactory factory;

	public TractorDAOImpl(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void saveTractor(TractorDTO dto) {
		System.out.println("invoked saveTractor");
		Session session = null;
		Transaction transcation = null;
		try {
			session = factory.openSession();
			transcation = session.beginTransaction();
			session.save(dto);
			transcation.commit();
			System.out.println("transactiondto is saved");
		} catch (Exception e) {
			transcation.rollback();

		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("closed");
			} else {
				System.out.println("not closed");
			}
		}

	}

}
