package com.mirhan.zuppin.testCase.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mirhan.zuppin.testCase.DataAccess.IDosyaDal;
import com.mirhan.zuppin.testCase.Entities.Dosya;

@Service
public class DosyaManager implements IDosyaService{
	private IDosyaDal dosyaDal;
	
	@Autowired
	public DosyaManager(IDosyaDal dosyaDal) {
		super();
		this.dosyaDal = dosyaDal;
	}
	
	@Override
	@Transactional
	public List<Dosya> getAll(){
		return this.dosyaDal.getAll();
	}
	
	@Override
	@Transactional
	public void add(Dosya dosya) {
		this.dosyaDal.add(dosya);
	}
	
	@Override
	@Transactional
	public void update(Dosya dosya) {
		this.dosyaDal.update(dosya);
	}
	
	@Override
	@Transactional
	public void delete(Dosya dosya) {
		this.dosyaDal.delete(dosya);
	}

	@Override
	@Transactional
	public Dosya getById(int dosya_id) {
		return this.dosyaDal.getById(dosya_id);
	}
}
