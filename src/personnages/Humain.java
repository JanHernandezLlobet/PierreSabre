package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	protected String[] connaissances;	
	private int curseur;
		
	
	public Humain(String prenom, String boisson, int money){
		this.nom = prenom;
		this.boissonPref = boisson;
		this.argent = money;
		this.connaissances = new String[30];
		this.curseur = 0;
	}
	
	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	 public void parler(String texte) { 
		System.out.println("(" + nom + ") : " + texte); 
	 }

	 public void gagnerArgent(int qtite) {
		 this.argent += qtite;
	 }

	 public void perdreArgent(int qtite) {
		 this.argent -= qtite;
	 }
	 
	 public void direBonjour() {
		 parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boissonPref);
	 }
	 
	 public void boire() {
		 parler("Mmmm, un bon verre de " + boissonPref + "! GLOUPS!");
	 }
	 
	 public void acheter(String bien, int prix) {
		 if(prix >= argent) {
			 parler("J'ai " + argent + "sous en poche. Je vais pouvoir m'offrir " + bien + " a " + prix + " sous!");
			 this.argent -= prix;
		 }
		 else {
			 parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir " + bien + " a " + prix + " sous.");
		 } 
	 }
	 
	 private void memoriser(Humain autreHumain) {
		 this.connaissances[curseur] = autreHumain.getNom();
		 this.curseur += 1;
		 this.curseur = this.curseur % this.connaissances.length;
	 }
	 
	 public void faireConnaissanceAvec(Humain autreHumain) {
		 direBonjour();
		 autreHumain.direBonjour();
		 autreHumain.memoriser(this);
		 memoriser(autreHumain);
	 }
	 
	 public void listerConnaissance() {
		 String liste = "";
		 for(int i=0; i < this.connaissances.length ; i++) {
			 if( this.connaissances[i] != null) {
				 liste += this.connaissances[i] + ", ";
			 }
		 }
		 parler("Je connais beaucoup de monde dont : " + liste );		 
	 }
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
