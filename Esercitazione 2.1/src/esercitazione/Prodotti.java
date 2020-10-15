package esercitazione;

public class Prodotti {
	
	private int barCode;
	private String descrizione;
	private float prezzo;
	
	public Prodotti(int barCode, String descrizione, float prezzo) {
		this.barCode = barCode;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float f) {
		this.prezzo = f;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	@Override
	public String toString() {
		return "Prodotto [barCode=" + barCode + ", prezzo=" + prezzo + ", descrizione=" + descrizione + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + barCode;
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + Float.floatToIntBits(prezzo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotti other = (Prodotti) obj;
		if (barCode != other.barCode)
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (Float.floatToIntBits(prezzo) != Float.floatToIntBits(other.prezzo))
			return false;
		return true;
	}

	public void applicaSconto() {
		setPrezzo(getPrezzo() * 0.95f);
	}
	
}
