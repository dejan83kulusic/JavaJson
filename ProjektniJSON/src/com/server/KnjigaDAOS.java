package com.server;


import java.util.ArrayList;
import java.util.List;

public class KnjigaDAOS {
    private List<KnjigaDAO> knjigaList;
 
    public KnjigaDAOS() {
    	knjigaList = new ArrayList<>();
	}
  
	public List<KnjigaDAO> getKnjigaList() {
        return knjigaList;
    }
 
    public void setKnjigaList(List<KnjigaDAO> knjigaList) {
        this.knjigaList = knjigaList;
    }
}