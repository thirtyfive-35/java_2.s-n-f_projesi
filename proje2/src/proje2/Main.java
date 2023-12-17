package proje2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseAnimals[] loggers = new BaseAnimals[] { new Tavuk(), new BuyukBas(),new KucukBas() };
		
		char deger;
		
		Scanner klavye = new Scanner(System.in);
		Dogrulama d = new Dogrulama();
		
		System.out.println("Yöneti --> Y , Teknisyen --> T , Çıkış  --> herhangi bir karaktere basınız :");
		deger = klavye.next().charAt(0);
		
		
		int kontDeger =d.secim(deger);

		
		if(kontDeger == 0) {
		for (BaseAnimals log : loggers) {
			AnimalsManager.Teknisyen teknisyen = new AnimalsManager().new Teknisyen(log);

		}
		}
		else if(kontDeger ==1) {
		for (BaseAnimals log : loggers) {
			AnimalsManager.Yonetici yonetici = new AnimalsManager().new Yonetici(log);

		}
		}
		else
			System.out.println("Sistemden çıkılıyor...");
		
		 
		
		
		

	}

}
