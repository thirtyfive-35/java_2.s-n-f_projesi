package proje2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Dogrulama {

	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));        
	int sifre =0;
	char[] ad = new char[8];
	char harf;

	public Dogrulama() {
		// TODO Auto-generated constructor stub
		System.out.println("Giriş sistemine hoş geldiniz");

	}

	public int alanSecim(int deger) {
		return 0;
	}
	public int alanSecim(char deger) {
		return 1;
	}
	public int alanSecim() {
		return 0;
	}

	public int secim(char harf) {
		this.harf = harf;
		switch (harf) {
		case 'Y':
			this.giris();
			return this.alanSecim(harf);
			
		case 'T':
			this.giris();
			return this.alanSecim(1);
		default:
			this.alanSecim();
		}
		
			
		return 6;
	}

	public void giris() {

		while (true) {
			try {
				System.out.println("Kullanıcı Adınızı Giriniz: ");
				ad = bufferedReader.readLine().toCharArray();

				if (ad.length > 8) {
					throw new Exception();
				}

				System.out.println("Şifrenizi Giriniz: ");
				sifre = Integer.parseInt(bufferedReader.readLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Şifreniz yada kullanıcı adınız hatalı,yeniden giriş yapmayı deneyiniz.");

			} catch (Exception e) {

				System.out.println("Kullanıcı adınız 8 karakteri geçemez,tekrar deneyiniz.");

			}

		}

	}

}
