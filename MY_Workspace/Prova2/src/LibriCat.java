class LibriCat extends Libri {

		public LibriCat(String titolo, int anno, int costo) {
			super();
			this.titolo = titolo;
			this.anno = anno;
			this.costo = costo;
		}

		public boolean stessoCosto(int x) {
			if (x == this.costo) {
				return true;
			} else

				return false;
		}



}