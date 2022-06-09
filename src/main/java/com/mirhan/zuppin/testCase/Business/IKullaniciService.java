package com.mirhan.zuppin.testCase.Business;

import java.util.List;

import com.mirhan.zuppin.testCase.Entities.Kullanici;

public interface IKullaniciService {
	List<Kullanici> getAll();
	void add(Kullanici kullanici);
	void update(Kullanici kullanici);
	void delete(Kullanici kullanici);
	Kullanici getById(int kullanici_id);
}
