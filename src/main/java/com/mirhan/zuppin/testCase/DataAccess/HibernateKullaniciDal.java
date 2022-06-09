package com.mirhan.zuppin.testCase.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mirhan.zuppin.testCase.Entities.Kullanici;

@Repository
public class HibernateKullaniciDal implements IKullaniciDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateKullaniciDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Kullanici> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Kullanici> kullanicilar = session.createQuery("from Kullanici", Kullanici.class).getResultList();
		return kullanicilar;
	}

	@Override
	public void add(Kullanici kullanici) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(kullanici);		
	}

	@Override
	public void update(Kullanici kullanici) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(kullanici);		
	}

	@Override
	public void delete(Kullanici kullanici) {
		Session session = entityManager.unwrap(Session.class);
		Kullanici silinecekKullanici = session.get(Kullanici.class, kullanici.getKullanici_id());
		session.delete(silinecekKullanici);		
	}

	@Override
	public Kullanici getById(int kullanici_id) {
		Session session = entityManager.unwrap(Session.class);
		Kullanici kullanici = session.get(Kullanici.class, kullanici_id);
		return kullanici;
	}

}
