package com.mirhan.zuppin.testCase.Business;

import java.util.List;

import com.mirhan.zuppin.testCase.Entities.Dosya;

public interface IDosyaService {
	List<Dosya> getAll();
	void add(Dosya dosya);
	void update(Dosya dosya);
	void delete(Dosya dosya);
	Dosya getById(int dosya_id);
}
