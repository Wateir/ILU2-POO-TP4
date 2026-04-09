package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{

	public Sanglier(Gaulois chasseur, int poid) {
		super("sanglier", Unite.kilogramme);
		this.chasseur = chasseur;
		this.poid = poid;
	}

	private Gaulois chasseur;
	private int poid;
	
	@Override
	public String decrireProduit() {
		StringBuilder retour = new StringBuilder();
		retour.append(getNom());
		retour.append("de ");
		retour.append(poid);
		retour.append(" ");
		retour.append(unite.toString());
		retour.append(" chassé par ");
		retour.append(chasseur.getNom());
		
		return retour.toString();
	}
	
}
