public class SquadraDiCalcio {
	int[] formazione;
	int difensori;
	int centrocampisti;
	int attaccanti;
	int portieri;

	public SquadraDiCalcio(int[] formazione) throws TooLargeException {

		this.formazione = formazione;
		this.difensori = 0;
		this.centrocampisti = 0;
		this.attaccanti = 0;
		this.portieri = 0;
		
		int totale = 0;
		for (int i = 0; i < 4; i++) {
			totale = totale + formazione[i];
		}
		if (totale > 11) {
			throw new TooLargeException("Risultato troppo grande");
		}

	}

	public int aggiungiPortieri(int p) throws TooLargeException {
		if (p + this.portieri > formazione[0]) {
			throw new TooLargeException("Risultato troppo grande");
		} else {
			this.portieri = p + this.portieri;
		}
		return p;

	}

	public int aggiungiDifensori(int d) throws TooLargeException {
		if (d + this.difensori > formazione[1]) {
			throw new TooLargeException("Risultato troppo grande");
		} else {
			this.difensori = d + this.difensori;
		}
		return d;

	}

	public int aggiungiCentrocampisti(int c) throws TooLargeException {
		if (c + this.centrocampisti > formazione[2]) {
			throw new TooLargeException("Risultato troppo grande");
		} else {
			this.centrocampisti = c + this.centrocampisti;
		}
		return c;

	}

	public int aggiungiAttaccanti(int a) throws TooLargeException {
		if (a + this.attaccanti > formazione[3]) {
			throw new TooLargeException("Risultato troppo grande");
		} else {
			this.attaccanti = a + this.attaccanti;
		}
		return a;
	}

	public static void main(String[] args) {
		int [] formazione1 = new int[4];
		formazione1 [0]=1;
		formazione1 [1]=5;
		formazione1 [2]=3;
		formazione1 [3]=2;
	
		try {
			SquadraDiCalcio juve = new SquadraDiCalcio(formazione1);
			juve.aggiungiDifensori(4);
		} catch (TooLargeException e) {
			e.printStackTrace();
		}
		int [] formazione2 = new int[4];
		formazione2 [0]=1;
		formazione2 [1]=4;
		formazione2 [2]=4;
		formazione2 [3]=2;
		try {
			SquadraDiCalcio milan = new SquadraDiCalcio(formazione2);
			milan.aggiungiCentrocampisti(4);
		} catch (TooLargeException e) {
			e.printStackTrace();
		}
			
	}
	
}
