public class Prova {

	public static void main(String[] args) {
	/*LibriCat l1 = new LibriCat("Nome della Rosa", 1986, 20);
	LibriCat l2 = new LibriCat("Anna Karenina", 1877, 20);
	System.out.println(l1.stessoCosto(l2.costo));*/
		
		Libro l1 = new Libro("storia",35);
		Libro l2 = new Libro("letteratura",17);
		Libro l3 = new Libro("storia",10);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
	}

}
