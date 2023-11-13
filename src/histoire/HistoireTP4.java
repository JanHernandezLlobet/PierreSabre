package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {

		
		System.out.println("------| Scenario 1 |------");
		Humain prof = new Humain("Prof", "kambucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		System.out.println("");
		System.out.println("------| Scenario 2 |------");
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println("");
		System.out.println("------| Scenario 3 |------");
		Yakuza Yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Yaku.direBonjour();
		Yaku.extorquer(marco);
		
		System.out.println("");
		System.out.println("------| Scenario 4 |------");
		Ronin Roro = new Ronin("Roro", "shochu", 60);
		Roro.direBonjour();
		Roro.donner(marco);	
		Roro.provoquer(Yaku);
		
	}
	
}
