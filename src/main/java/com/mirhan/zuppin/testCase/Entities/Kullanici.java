package com.mirhan.zuppin.testCase.Entities;

import javax.persistence.*;

@Entity
@Table(name="kullanici")
public class Kullanici {
	@Id
	@Column(name="kullanici_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int kullanici_id;
	@Column(name="kullanici_adi")
	private String kullanici_adi;
	@Column(name="kullanici_sifre")
	private String kullanici_sifre;
	
	public Kullanici(int kullanici_id, String kullanici_adi, String kullanici_sifre) {
		super();
		this.kullanici_id = kullanici_id;
		this.kullanici_adi = kullanici_adi;
		this.kullanici_sifre = kullanici_sifre;
	}

	public Kullanici() {}

	public int getKullanici_id() {
		return kullanici_id;
	}

	public void setKullanici_id(int kullanici_id) {
		this.kullanici_id = kullanici_id;
	}

	public String getKullanici_adi() {
		return kullanici_adi;
	}

	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}

	public String getKullanici_sifre() {
		return kullanici_sifre;
	}

	public void setKullanici_sifre(String kullanici_sifre) {
		this.kullanici_sifre = kullanici_sifre;
	}

	
}
