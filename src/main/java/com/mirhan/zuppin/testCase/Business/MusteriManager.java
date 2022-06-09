package com.mirhan.zuppin.testCase.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mirhan.zuppin.testCase.DataAccess.IMusteriDal;
import com.mirhan.zuppin.testCase.Entities.Musteri;

@Service
public class MusteriManager implements IMusteriService {

	private IMusteriDal musteriDal;
	
	@Autowired
	public MusteriManager(IMusteriDal musteriDal) {
		super();
		this.musteriDal = musteriDal;
	}
	
	@Override
	@Transactional
	public List<Musteri> getAll() {
		return this.musteriDal.getAll();
	}

	@Override
	@Transactional
	public void add(Musteri musteri) {
		this.musteriDal.add(musteri);
	}

	@Override
	@Transactional
	public void update(Musteri musteri) {
		this.musteriDal.update(musteri);
	}

	@Override
	@Transactional
	public void delete(Musteri musteri) {
		this.musteriDal.delete(musteri);
	}

	@Override
	@Transactional
	public Musteri getById(int musteri_id) {
		return this.musteriDal.getById(musteri_id);
	}

}
