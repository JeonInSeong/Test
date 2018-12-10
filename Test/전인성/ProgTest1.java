package 전인성;

public class ProgTest1 {
	public static int cVar = 0;

	String[] iStr = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	double iDouble;
	boolean iBool = false;
	String iChar = "a";

	public String getGugudan(int dan) {
		String ab = "";
		
		ab = (dan + "단: \n");

		for (int y = 1; y < 9; y++) {			
			ab = ab + (dan + "*" + y + "=" + dan * y + "\t");
		}

		return ab;
	}
	public static void main(String[]args) {
		
	}
}
