package com.mirhan.zuppin.testCase.restApi;

import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mirhan.zuppin.testCase.Business.IDosyaService;
import com.mirhan.zuppin.testCase.Entities.Dosya;

@RestController
@RequestMapping("/api/dosya")
public class DosyaController {

	private IDosyaService dosyaService;

	@Autowired
	public DosyaController(IDosyaService dosyaService) {
		super();
		this.dosyaService = dosyaService;
	}
	
	@GetMapping("/all")
	public List<Dosya> getAll(){
		return dosyaService.getAll();
	}
	
	@GetMapping("/id/{dosya_id}")
	public Dosya getById(@PathVariable int dosya_id) {
		Dosya dosya = dosyaService.getById(dosya_id);
		System.out.println(dosya);
		return dosya;
	}
	
	@PostMapping("/add")
	public String add(@RequestParam(value="dosya_file", required=true) MultipartFile dosya_file, @RequestParam(value="dosya_adi", required=true) String dosya_adi, @RequestParam(value="musteri_id", required=true) int musteri_id) throws IOException {
		byte[] bytes = dosya_file.getBytes();
	    Dosya dosya = new Dosya(0, dosya_adi, musteri_id);
	    dosya.setDosya(bytes);
	    dosyaService.add(dosya);
		return "File Added Successfully..";
	}

	@PostMapping("/update")
	public String update(@RequestParam(value="dosya_file", required=true) MultipartFile dosya_file, @RequestParam(value="dosya_adi", required=true) String dosya_adi, @RequestParam(value="musteri_id", required=true) int musteri_id, @RequestParam(value="dosya_id", required=true) int dosya_id) throws IOException {
		byte[] bytes = dosya_file.getBytes();
	    Dosya dosya = new Dosya(dosya_id, dosya_adi, musteri_id);
	    dosya.setDosya(bytes);
	    dosyaService.update(dosya);
		return "File updated Successfully..";
	}

	@PostMapping("/delete")
	public String delete(@RequestBody Dosya dosya) {
		dosyaService.delete(dosya);
		return "File Removed Successfully..";
	}
}
