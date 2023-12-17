package proje2;

public abstract class BaseAnimals {

	private int yemMiktari; 
	private int sıcaklıkDeger; 
	private int nemYuzdesi; 
	private double yemUcreti; 
	private int suDegeri; 
	private double suUcreti; 
	private int hayvanSayısı; 

	public int getYemMiktari() {
		return yemMiktari;
	}

	public void setYemMiktari(int yemMiktari) {
		this.yemMiktari = yemMiktari;
	}

	public int getSıcaklıkDeger() {
		return sıcaklıkDeger;
	}

	public void setSıcaklıkDeger(int sıcaklıkDeger) {
		this.sıcaklıkDeger = sıcaklıkDeger;
	}

	public int getNemYuzdesi() {
		return nemYuzdesi;
	}

	public void setNemYuzdesi(int nemYuzdesi) {
		this.nemYuzdesi = nemYuzdesi;
	}

	public double getYemUcreti() {
		return yemUcreti;
	}

	public void setYemUcreti(double yemUcreti) {
		this.yemUcreti = yemUcreti;
	}

	public int getSuDegeri() {
		return suDegeri;
	}

	public void setSuDegeri(int suDegeri) {
		this.suDegeri = suDegeri;
	}

	public double getSuUcreti() {
		return suUcreti;
	}

	public void setSuUcreti(double suUcreti) {
		this.suUcreti = suUcreti;
	}

	public int getHayvanSayısı() {
		return hayvanSayısı;
	}

	public void setHayvanSayısı(int hayvanSayısı) {
		this.hayvanSayısı = hayvanSayısı;
	}

	public abstract int hayvanSayisiHesap();

	public abstract boolean sicaklikKontrol();

	public abstract int sicaklik();

	public abstract void aydınlatma();

	public abstract int nem();

	public abstract boolean nemKontrol();

	public abstract void giderHesap();

	public abstract void havalandırma();

	public abstract void temelBilYazdır();
}
