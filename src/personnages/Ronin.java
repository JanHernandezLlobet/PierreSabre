package personnages;

public class Ronin extends Humain {
	private int honneur;
	private int force;
	
	public int getHonneur() {
		return this.honneur;
	}
	
	public int getForce() {
		return this.force;
	}

	public Ronin(String prenom, String boisson, int money) {
		super(prenom, boisson, money);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		float cadeau;
		int cadeauInt;
		cadeau = (float)(0.1 * getArgent());
		cadeauInt = (int)cadeau;
		perdreArgent(cadeauInt);
		parler(beneficiaire.getNom() + " prend ces " + cadeauInt + " sous.");
		beneficiaire.recevoir(cadeauInt);
	}
		
	public void provoquer( Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if( this.getForce() >= adversaire.getReputation()) {
			parler("Je t'ai eu petit Yakuza!");
			gagnerArgent(adversaire.perdre());
			this.honneur += 1;
		}
		else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			this.honneur -= 1;			
		}
	}
	
	
	
}
