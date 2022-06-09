package com.mirhan.zuppin.testCase.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mirhan.zuppin.testCase.DataAccess.IKullaniciDal;
import com.mirhan.zuppin.testCase.Entities.Kullanici;

@Service
public class KullaniciManager implements IKullaniciService {

	private IKullaniciDal kullaniciDal;
	
	@Autowired
	public KullaniciManager(IKullaniciDal kullaniciDal) {
		super();
		this.kullaniciDal = kullaniciDal;
	}
	
	@Override
	@Transactional
	public List<Kullanici> getAll() {
		return this.kullaniciDal.getAll();
	}

	@Override
	@Transactional
	public void add(Kullanici kullanici) {
		this.kullaniciDal.add(kullanici);
	}

	@Override
	@Transactional
	public void update(Kullanici kullanici) {
		this.kullaniciDal.update(kullanici);
	}

	@Override
	@Transactional
	public void delete(Kullanici kullanici) {
		this.kullaniciDal.delete(kullanici);
	}

	@Override
	@Transactional
	public Kullanici getById(int kullanici_id) {
		return this.kullaniciDal.getById(kullanici_id);
	}

}
