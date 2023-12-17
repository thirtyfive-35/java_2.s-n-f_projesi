package proje2;

import java.util.Scanner;

public class Tavuk extends BaseAnimals {

	public Tavuk() {
		super.setHayvanSayısı(hayvanSayisiHesap());
		super.setSuDegeri(getHayvanSayısı() * 2);
		super.setYemMiktari(getHayvanSayısı() * 1);
		super.setYemUcreti(getYemMiktari() * 14.74);
		super.setSuUcreti(getSuDegeri() * 1.25);
	}

	@Override
	public int hayvanSayisiHesap() {
		// TODO Auto-generated method stub
		return (int) (Math.random() * 800 + 1); 

	}

	@Override
	public boolean sicaklikKontrol() {
		// TODO Auto-generated method stub
		super.setSıcaklıkDeger(sicaklik());
		if (getSıcaklıkDeger() < 30 && getSıcaklıkDeger() > 15) {
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
		System.out.println("\r--- Işık Rengi Ayarlama --- ");
		System.out.println("Işığın rengini seçiniz. Sırasıyla mavi(1),yeşil(2),kırmızı(3)");
		System.out.println("Mavi ışık (ileri yaşta gelişim hızını arttırır)");
		System.out.println("Yeşil ışık (genç yaşta gelişim hızını arttırır)");
		System.out.println("Kırmızı ışık (Çiftleşme döneminde kullanılır)");

		Scanner klavye = new Scanner(System.in);
		int secim = klavye.nextInt();

		switch (secim) {
		case 1:
			System.out.println("Mavi ışık açıldı.");
			break;
		case 2:
			System.out.println("Yeşil ışık açıldı.");
			break;
		case 3:
			System.out.println("Kırmızı ışık açıldı.");
			break;
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

		System.out.println("\r--- GİDER TABLOSU ---");

		System.out.println("Yem Ücreti : " + getYemUcreti() + " TL" + " Su Ücreti : " + getSuUcreti() + " TL");
		System.out.println("Toplam Gider : " + (getSuUcreti() + getYemMiktari() + " TL"));

	}

	@Override
	public boolean nemKontrol() {
		// TODO Auto-generated method stub
		super.setNemYuzdesi(nem());
		if (getNemYuzdesi() < 80 && getNemYuzdesi() > 40) {
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
		System.out.println("\r\r\t*** TAVUK ***");
		System.out.println("Hayvan Sayısı: " + super.getHayvanSayısı());
		System.out.println("Tüketilecek Yem Miktarı: " + super.getYemMiktari() + " Kg");
		System.out.println("Tüketilecek Su Miktarı: " + super.getSuDegeri() + "Litre");
	}

}
