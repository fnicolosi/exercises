public interface Documenti {
	public boolean uguale(int X);
}

class Libro {
	protected String soggetto;
	protected int costo;

	public Libro(String string, int i) {
	}

	public boolean uguale(String x) {
		
		if (x != null) {
			return x.equals(this.soggetto);
		}
		
		return false;
	}

}