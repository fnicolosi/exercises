public class Chess {

	public static void main(String[] args) {
		String [][] chessArray = new String [8][8];

		for (int i = 0; i < 8; i++) {
			String linea = "";
			for (int j = 0; j < 8; j++) {
				
				if ((i < 8 && j < 2) || (i < 8 && j > 5)) {
					chessArray[i][j] = "|*|";
				} else {
					chessArray[i][j] = "|_|";
				}
							
				linea +=chessArray[i][j];
				
			}
			System.out.println(linea);
		}
		
	}
	

}
