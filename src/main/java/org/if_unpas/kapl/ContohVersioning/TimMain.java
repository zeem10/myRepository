package org.if_unpas.kapl.ContohVersioning;

public class TimMain {
	public static void main(String[] args) {
		Tim tim = new Tim("Persib");
		
		Pemain pemain1 = new Pemain("I Made", 1);
		Pemain pemain2 = new Pemain("Atep", 7);
		Pemain pemain3 = new Pemain("Essien", 5);
		
		tim.tambahPemainInti(pemain1);
		tim.tambahPemainInti(pemain2);
		tim.tambahPemainInti(pemain3);
		tim.tambahPemainInti(new Pemain("Febry", 22));
		
		tim.tampilPemainInti();
	}
}
