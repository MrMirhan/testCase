package com.mirhan.zuppin.testCase.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirhan.zuppin.testCase.Business.IKullaniciService;
import com.mirhan.zuppin.testCase.Entities.Kullanici;

@RestController
@RequestMapping("/api/kullanici")
public class KullaniciController {
	
	private IKullaniciService kullaniciService;
	
	@Autowired
	public KullaniciController(IKullaniciService kullaniciService) {
		super();
		this.kullaniciService = kullaniciService;
	}
	
	@GetMapping("/all")
	public List<Kullanici> getAll(){
		return kullaniciService.getAll();
	}
	
	@GetMapping("/id/{kullanici_id}")
	public Kullanici getById(@PathVariable int kullanici_id) {
		return kullaniciService.getById(kullanici_id);
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Kullanici kullanici) {
		kullaniciService.add(kullanici);
		return "User Added Successfully..";
	}

	@PostMapping("/update")
	public String update(@RequestBody Kullanici kullanici) {
		kullaniciService.update(kullanici);
		return "User Updated Successfully..";
	}

	@PostMapping("/delete")
	public String delete(@RequestBody Kullanici kullanici) {
		kullaniciService.delete(kullanici);
		return "User Removed Successfully..";
	}
}
