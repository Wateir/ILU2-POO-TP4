package produit;

public abstract class Produit implements IProduit {
	protected String nom;
	protected Unite unite;
	
	
	@Override
	public String getNom() {
		return nom;
	}
	
	public Produit(String nom, Unite unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}

	@Override
	public abstract String decrireProduit();
	
}
