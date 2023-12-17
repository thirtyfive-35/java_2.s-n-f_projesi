package proje2;

import java.util.Scanner;

public class BuyukBas extends BaseAnimals {

	public BuyukBas() {
		super.setHayvanSayısı(hayvanSayisiHesap());
		super.setSuDegeri(getHayvanSayısı() * 100);
		super.setYemMiktari(getHayvanSayısı() * 1);
		super.setYemUcreti(getYemMiktari() * 150);
		super.setSuUcreti(getSuDegeri() * 1.25);
	}

	@Override
	public int hayvanSayisiHesap() {
		// TODO Auto-generated method stub
		return (int) (Math.random() * 500 + 1);

	}

	@Override
	public boolean sicaklikKontrol() {
		// TODO Auto-generated method stub
		super.setSıcaklıkDeger(sicaklik());
		if (getSıcaklıkDeger() < 25 && getSıcaklıkDeger() > 10) {
			System.out.println(getSıcaklıkDeger() + "°C" + " --> " + "Uygun sıcaklık değeri sağlandı.");
			return true;
		} else {
			System.out.println(getSıcaklıkDeger() + "°C" + " --> " + "Uygun sıcaklık değeri sağlanamadı");
			System.out.println("sıcaklık degeri uygun duruma getiriliyor...");
			sicaklikKontrol();
		}
		return true;

	}

	@Override
	public int sicaklik() {
		// TODO Auto-generated method stub

		return (int) (Math.random() * 40 + 1);
	}

	@Override
	public void aydınlatma() {

		System.out.println("\r--- Işık Sistemi ---");

		int deger = (int) (Math.random() * 2 + 0);

		if (deger == 0) {
			System.out.println("Işıklar kapalı, açılıyor.");
		} else {
			System.out.println("Işıklar Açık");
		}
	}

	@Override
	public int nem() {
		// TODO Auto-generated method stub
		return (int) (Math.random() * 100 + 1);

	}

	@Override
	public void giderHesap() {
		// TODO Auto-generated method stub

		System.out.println("\r--- GİDER TABLOSU ---  ");

		System.out.println("Yem Ücreti : " + getYemUcreti() + " TL" + " Su Ücreti : " + getSuUcreti() + " TL");
		System.out.println("Toplam Gider : " + (getSuUcreti() + getYemMiktari() + " TL"));

	}

	@Override
	public boolean nemKontrol() {
		// TODO Auto-generated method stub
		super.setNemYuzdesi(nem());
		if (getNemYuzdesi() < 70 && getNemYuzdesi() > 30) {
			System.out.println("%" + getNemYuzdesi() + " --> " + "Uygun nem yüzdesi sağlandı.");

			return true;
		} else {
			System.out.println("%" + getNemYuzdesi() + " --> " + "Uygun nem yüzdesi sağlanamadı.");
			System.out.println("Nem yüzdesi değiştiriliyor.");
			nemKontrol();
		}
		return true;
	}

	@Override
	public void havalandırma() {

		System.out.println("\r--- Havalandırma Sistemi ---");

		int deger = (int) (Math.random() * 2 + 0);

		if (deger == 0) {
			System.out.println("Havalandırma kapalı, açılıyor.");
		} else {
			System.out.println("Havalandırma Açık");
		}

	}

	@Override
	public void temelBilYazdır() {
		System.out.println("\r\r\t*** BÜYÜKBAŞ HAYVAN ***");
		System.out.println("Hayvan Sayısı: " + super.getHayvanSayısı());
		System.out.println("Tüketilecek Yem Miktarı: " + super.getYemMiktari()+ " Tane Balya");
		System.out.println("Tüketilecek Su Miktarı: " + super.getSuDegeri() + " Litre");
	}

}
