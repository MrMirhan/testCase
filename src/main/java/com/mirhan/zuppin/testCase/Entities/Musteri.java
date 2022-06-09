package com.mirhan.zuppin.testCase.Entities;

import javax.persistence.*;

@Entity
@Table(name="musteri")
public class Musteri {
	@Id
	@Column(name="musteri_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int musteri_id;
	@Column(name="musteri_adsoyad")
	private String musteri_adsoyad;
	@Column(name="musteri_email")
	private String musteri_email;
	
	public Musteri(int musteri_id, String musteri_adsoyad, String musteri_email) {
		super();
		this.musteri_id = musteri_id;
		this.musteri_adsoyad = musteri_adsoyad;
		this.musteri_email = musteri_email;
	}

	public Musteri() {}

	public int getMusteri_id() {
		return musteri_id;
	}

	public void setMusteri_id(int musteri_id) {
		this.musteri_id = musteri_id;
	}

	public String getMusteri_adsoyad() {
		return musteri_adsoyad;
	}

	public void setMusteri_adsoyad(String musteri_adsoyad) {
		this.musteri_adsoyad = musteri_adsoyad;
	}

	public String getMusteri_email() {
		return musteri_email;
	}

	public void setMusteri_email(String musteri_email) {
		this.musteri_email = musteri_email;
	}

}
