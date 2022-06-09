package com.mirhan.zuppin.testCase.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirhan.zuppin.testCase.Business.IMusteriService;
import com.mirhan.zuppin.testCase.Entities.Musteri;

@RestController
@RequestMapping("/api/musteri")
public class MusteriController {
	
	private IMusteriService musteriService;
	
	@Autowired
	public MusteriController(IMusteriService musteriService) {
		super();
		this.musteriService = musteriService;
	}
	
	@GetMapping("/all")
	public List<Musteri> getAll(){
		return musteriService.getAll();
	}
	
	@GetMapping("/id/{musteri_id}")
	public Musteri getById(@PathVariable int musteri_id) {
		return musteriService.getById(musteri_id);
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Musteri musteri) {
		musteriService.add(musteri);
		return "Customer Added Successfully..";
	}

	@PostMapping("/update")
	public String update(@RequestBody Musteri musteri) {
		musteriService.update(musteri);
		return "Customer Updated Successfully..";
	}

	@PostMapping("/delete")
	public String delete(@RequestBody Musteri musteri) {
		musteriService.delete(musteri);
		return "Customer Deleted Successfully..";
	}
}
