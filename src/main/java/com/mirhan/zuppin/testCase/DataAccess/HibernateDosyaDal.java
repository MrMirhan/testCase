package com.mirhan.zuppin.testCase.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mirhan.zuppin.testCase.Entities.Dosya;

@Repository
public class HibernateDosyaDal implements IDosyaDal {
	private EntityManager entityManager;
	
	@Autowired
	public HibernateDosyaDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Dosya> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Dosya> dosyalar = session.createQuery("from Dosya", Dosya.class).getResultList();
		return dosyalar;
	}

	@Override
	public void add(Dosya dosya) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(dosya);
		
	}

	@Override
	public void update(Dosya dosya) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(dosya);
	}

	@Override
	public void delete(Dosya dosya) {
		Session session = entityManager.unwrap(Session.class);
		Dosya silinecekDosya = session.get(Dosya.class, dosya.getDosya_id());
		session.delete(silinecekDosya);
		
	}

	@Override
	public Dosya getById(int dosya_id) {
		Session session = entityManager.unwrap(Session.class);
		Dosya dosya = session.get(Dosya.class, dosya_id);
		return dosya;
	}

}
