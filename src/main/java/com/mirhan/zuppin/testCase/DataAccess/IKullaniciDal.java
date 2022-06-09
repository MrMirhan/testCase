package com.mirhan.zuppin.testCase.DataAccess;

import java.util.List;
import com.mirhan.zuppin.testCase.Entities.Kullanici;

public interface IKullaniciDal {
	List<Kullanici> getAll();
	void add(Kullanici kullanici);
	void update(Kullanici kullanici);
	void delete(Kullanici kullanici);
	Kullanici getById(int kullanici_id);
}