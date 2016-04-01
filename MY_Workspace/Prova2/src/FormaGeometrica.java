public class FormaGeometrica implements TestInterface {
	protected int lati;
	protected String nome;

	public double perimetro(double sizeL) {
		return sizeL * this.lati;

	}

	public Integer area(Integer l) throws TooLargeException {
		Integer y = Integer.valueOf(l.intValue() * l.intValue());

		if (y.intValue() > 1000) {
			throw new TooLargeException("Risultato troppo grande");
		}
		return y;
	}

	public static void main(String[] Args) {
		Quadrato uno = new Quadrato();
		TriangoloEq due = new TriangoloEq();
		Integer result = null;
		try {
			result = uno.area(null);
		} catch (NullPointerException e) {
			System.out.println(result);
				
		} catch (TooLargeException e) {
			System.out.println(result);
		}
		try {
			result = uno.area(Integer.valueOf(3));
			
		} catch (TooLargeException e) {
			System.out.println(result);		}
		try {
			result = uno.area(Integer.valueOf(1000));
			
		} catch (TooLargeException e) {
			System.out.println(result);
			}
	}

}