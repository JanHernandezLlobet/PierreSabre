package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String prenom, String boisson, int money, String clan) {
		super(prenom, boisson, money);
		this.reputation = 0;
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		int argentVole;
		parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe par la?");
		parler(victime.getNom() + ", si tu tiens a la vie donne moi ta bourse!");
		argentVole = victime.seFaireExtorquer();
		parler("J'ai pique les " + victime.getArgent() + "sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi! Hi!");
		gagnerArgent(argentVole);
	}
	
	
	
	
	
}