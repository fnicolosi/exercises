import java.util.ArrayList;
import java.util.List;

public class ChessTwo {

	public static void main(String[] args) {
		List<List<String>> listA = new ArrayList<List<String>>();
		for (int i = 0; i < 8; i++) {
			String linea = "";
			for (int j = 0; j < 8; j++) {

				if ((i < 8 && j < 2) || (i < 8 && j > 5)) {
					//listA = "|*|";
				} else {
					//listA = "|_|";
				}

				linea += listA;

			}
			System.out.println(linea);
		}

	}

}
