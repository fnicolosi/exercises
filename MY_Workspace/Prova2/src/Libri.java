public abstract class Libri {
	protected String titolo;
	protected int anno;
	protected int costo;

	public abstract boolean stessoCosto(int x);
		
	
	 class LibriCat extends Libri {

		public LibriCat(String titolo, int anno, int costo) {
			super();
			this.titolo = titolo;
			this.anno = anno;
			this.costo = costo;
		}

		public LibriCat() {

		}

		public boolean stessoCosto(int x) {
			if (x == this.costo) {
				return true;
			} else

				return false;
		}

	}

}
