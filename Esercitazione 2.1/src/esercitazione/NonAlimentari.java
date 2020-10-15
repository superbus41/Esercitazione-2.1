package esercitazione;

public class NonAlimentari extends Prodotti {
	
	String materialePrincipale;

	public NonAlimentari(int barCode, String descrizione, float prezzo, String materialePrincipale) {
		super(barCode, descrizione, prezzo);
		this.materialePrincipale = materialePrincipale;
	}
	
	public String getMaterialePrincipale() {
		return materialePrincipale;
	}

	public void setMaterialePrincipale(String materialePrincipale) {
		this.materialePrincipale = materialePrincipale;
	}
	
	@Override
	public void applicaSconto() {
		if (materialePrincipale.equals("carta") || materialePrincipale.equals("plastica") || materialePrincipale.equals("vetro"))
			setPrezzo(getPrezzo() * 0.9f);
	}


}
