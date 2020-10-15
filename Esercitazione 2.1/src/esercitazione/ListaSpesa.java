package esercitazione;


public class ListaSpesa {

	public static void main(String[] args) {
		
		//Scanner s = new Scanner(System.in);
		float totale = 0;
		Prodotti[] p = new Prodotti[3];
		
		System.out.println("Inserire i prodotti acquistati");
		
		p[0] = new Alimentari(5414875, "Pane", 2.0f, new Data(17, 10, 2020));
		p[1] = new Prodotti(45758745, "Aspirapolvere", 200.0f);
		p[2] = new NonAlimentari(564547, "Cartoncini colorati", 5.0f, "carta");
		
		for (int i = 0; i < p.length; i++) {
			p[i].applicaSconto();
			totale += p[i].getPrezzo();
			System.out.println(p[i].getPrezzo());
		}
		
		System.out.printf("Totale spesa: %.2f euro", totale);
	}

}
