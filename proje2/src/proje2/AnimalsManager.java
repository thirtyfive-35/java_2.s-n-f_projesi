package proje2;

public class AnimalsManager {

	public AnimalsManager() {

	}

	public class Teknisyen {
		BaseAnimals baseAnimals;

		public Teknisyen(BaseAnimals baseAnimals) {
			this.baseAnimals = baseAnimals;
			baseAnimals.temelBilYazdır();
			System.out.println("\r--- Sıcaklık Kontrol ---");
			baseAnimals.sicaklikKontrol();
			System.out.println("\r--- Nem Kontrol ---");
			baseAnimals.nemKontrol();
			baseAnimals.aydınlatma();
			
		}

	}

	public class Yonetici {
		BaseAnimals baseAnimals;

		public Yonetici(BaseAnimals baseAnimals) {
			this.baseAnimals = baseAnimals;
			baseAnimals.temelBilYazdır();
			baseAnimals.giderHesap();
		}

	}

}
