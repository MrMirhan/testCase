package com.mirhan.zuppin.testCase.Business;

import java.util.List;

import com.mirhan.zuppin.testCase.Entities.Musteri;

public interface IMusteriService {
	List<Musteri> getAll();
	void add(Musteri musteri);
	void update(Musteri musteri);
	void delete(Musteri musteri);
	Musteri getById(int musteri_id);
}
