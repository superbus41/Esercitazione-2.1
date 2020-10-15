package esercitazione;

public class Alimentari extends Prodotti {
	
	private Data scadenza;

	public Alimentari(int barCode, String descrizione, float prezzo, Data scadenza) {
		super(barCode, descrizione, prezzo);
		this.scadenza = scadenza;
	}

	public Data getScadenza() {
		return scadenza;
	}

	public void setScadenza(Data scadenza) {
		this.scadenza = scadenza;
	}
	
	@Override
	public void applicaSconto() {
		Data d = new Data(15, 10, 2020);
		if (scadenza.getDifference(d) < 10)
			setPrezzo(getPrezzo() * 0.8f);
	}
	
}
