public class Ex43 {

	public static void main(String[] args) {
		int a = 110;
		int m = 150;
		int n = 0;
		
		while (a < m) {
			a = a + 3;
			m = m + 2;
			n = n + 1;
		}
		
		System.out.println("Serão necessários " + n + "anos para Ana ser maior que Maria");
	}
}