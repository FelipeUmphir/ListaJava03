public class Ex41 {

	public static void main(String[] args) {
		int n = 1, m = 0;
		System.out.println("As possibilidades da soma ser 7 são:");
		
		while (n < 7) {
			for (int i = 1; i < 8; i++) {
				m = n + i;
				if (m == 7) {
					System.out.println(n + "+" + i + "=" + m);
				}
			}

		    n = n + 1;
		}
	}
}