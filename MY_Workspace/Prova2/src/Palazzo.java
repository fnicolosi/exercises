public class Palazzo {
	int piano;

	public Palazzo() { 
		
		this.piano = 0;
	}

	public int aggiungiPiano(int p) throws PalazzoException {
		
		if (p == piano +1) {
				System.out.println("Piano = "+p);
				piano = p;
			}else{throw new PalazzoException("Piano sbagliato");
		}
		return p;
	}

	public static void main(String[] args) {
	Palazzo nuovo = new Palazzo();
	try {
		nuovo.aggiungiPiano(1);
	} catch (PalazzoException e) {
		e.printStackTrace();
	}
	try {
		nuovo.aggiungiPiano(2);
	} catch (PalazzoException e) {
		e.printStackTrace();
	}
	try {
		nuovo.aggiungiPiano(4);
	} catch (PalazzoException e) {
		e.printStackTrace();
	}
	}

}
