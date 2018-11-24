package org.if_unpas.kapl.ContohVersioning;

import java.util.ArrayList;
import java.util.List;

public class Tim {
	private String nama;
	private List<Pemain> pemainInti = new ArrayList<Pemain>();
	
	public Tim() {
		nama = "";
	}
	
	public Tim(String nama) {
		this.nama = nama;
	}
	
	public boolean tambahPemainInti(Pemain pemain) {
		if (pemainInti.size() < 11) {
			pemainInti.add(pemain);
			System.out.println(pemain.getNama()+ " berhasil menambahkan pemain inti.");
			return true;
		} else {
			System.out.println(pemain.getNama()+ " tidak berhasil menambahkan pemain inti.");
			return false;
		}
	}
}
