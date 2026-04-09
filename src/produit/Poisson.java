package produit;

public class Poisson extends Produit{
	private String date;
	
	
	
	public Poisson(String date) {
		super("poisson", Unite.piece);
		this.date = date;
	}

	@Override
	public String decrireProduit() {
		StringBuilder retour = new StringBuilder();
		retour.append(getNom());
		retour.append("pêchés ");
		retour.append(" ");
		retour.append(date);
		
		return retour.toString();
	}

}
