package com.server;

import java.io.Serializable;


@SuppressWarnings("serial")
public class KnjigaDAO implements Serializable {
	int isbn;
	String naslov;
	String pisac;
	String sadrzaj;
	int godina;
	String zanr;
	String izdavac;
	int br_stranica;
	public String url;
	String putanja;
	
	public KnjigaDAO() {
		super();
	}
	
	public KnjigaDAO(int isbn, String naslov, String pisac, String sadrzaj, int godina, String zanr, String izdavac,
		int br_stranica, String url, String putanja) {
		super();
		this.isbn = isbn;
		this.naslov = naslov;
		this.pisac = pisac;
		this.sadrzaj = sadrzaj;
		this.godina = godina;
		this.zanr = zanr;
		this.izdavac = izdavac;
		this.br_stranica = br_stranica;
		this.url = url;
		this.putanja = putanja;
	}
	
	@Override
	public String toString() {
		return "Knjiga [isbn=" + isbn + ", naslov=" + naslov + ", pisac=" + pisac + ", sadrzaj=" + sadrzaj + ", godina="
				+ godina + ", zanr=" + zanr + ", izdavac=" + izdavac + ", br_stranica=" + br_stranica + ", url=" + url
				+ ", putanja=" + putanja + "]";
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getPisac() {
		return pisac;
	}
	public void setPisac(String pisac) {
		this.pisac = pisac;
	}
	public String getSadrzaj() {
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) {
		this.godina = godina;
	}
	public String getZanr() {
		return zanr;
	}
	public void setZanr(String zanr) {
		this.zanr = zanr;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public int getBr_stranica() {
		return br_stranica;
	}
	public void setBr_stranica(int br_stranica) {
		this.br_stranica = br_stranica;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPutanja() {
		return putanja;
	}
	public void setPutanja(String putanja) {
		this.putanja = putanja;
	}

}

