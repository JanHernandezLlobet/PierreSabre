package personnages;

public class Ronin extends Humain {
	private int honneur;
	

	public Ronin(String prenom, String boisson, int money) {
		super(prenom, boisson, money);
		this.honneur = 1;
	}

	public void donner(Commercant beneficiaire) {
		float cadeau;
		cadeau = (float)(0.1 * getArgent());
		beneficiaire.gagnerArgent((int)cadeau);
		perdreArgent((int)cadeau);
		parler(beneficiaire + "prend ces " + (int)cadeau + " sous.")
	}
		
}
