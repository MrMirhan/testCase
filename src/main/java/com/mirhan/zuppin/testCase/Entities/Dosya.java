package com.mirhan.zuppin.testCase.Entities;

import javax.persistence.*;

@Entity
@Table(name="dosya")
public class Dosya {
	@Id
	@Column(name="dosya_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dosya_id;
	private byte[] dosya;
	private String dosya_adi;
	private int musteri_id;
	public Dosya(int dosya_id, String dosya_adi, int musteri_id) {
		super();
		this.dosya_id = dosya_id;
		this.dosya_adi = dosya_adi;
		this.musteri_id = musteri_id;
	}
	
	public Dosya() {}

	public int getDosya_id() {
		return dosya_id;
	}

	public void setDosya_id(int dosya_id) {
		this.dosya_id = dosya_id;
	}

	public byte[] getDosya() {
		return dosya;
	}

	public void setDosya(byte[] dosya) {
		this.dosya = dosya;
	}

	public String getDosya_adi() {
		return dosya_adi;
	}

	public void setDosya_adi(String dosya_adi) {
		this.dosya_adi = dosya_adi;
	}

	public int getMusteri_id() {
		return musteri_id;
	}

	public void setMusteri_id(int musteri_id) {
		this.musteri_id = musteri_id;
	}
	
	
}
