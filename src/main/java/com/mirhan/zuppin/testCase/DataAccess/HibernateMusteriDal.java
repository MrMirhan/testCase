package com.mirhan.zuppin.testCase.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mirhan.zuppin.testCase.Entities.Musteri;

@Repository
public class HibernateMusteriDal implements IMusteriDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateMusteriDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Musteri> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Musteri> kullanicilar = session.createQuery("from Musteri", Musteri.class).getResultList();
		return kullanicilar;
	}

	@Override
	public void add(Musteri musteri) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(musteri);		
	}

	@Override
	public void update(Musteri musteri) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(musteri);		
	}

	@Override
	public void delete(Musteri musteri) {
		Session session = entityManager.unwrap(Session.class);
		Musteri silinecekMusteri = session.get(Musteri.class, musteri.getMusteri_id());
		session.delete(silinecekMusteri);		
	}

	@Override
	public Musteri getById(int musteri_id) {
		Session session = entityManager.unwrap(Session.class);
		Musteri musteri = session.get(Musteri.class, musteri_id);
		return musteri;
	}

}
