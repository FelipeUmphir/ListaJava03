public class Ex42 {

	public static void main(String[] args) {
		double m = 1, i = 1, s = 0;
		
		while (m < 51) {
			s = s + m/i;
			m = m + 1;
			i = i + 2;
		}
		
		System.out.println("O resultado da série é: " + s);
	}
}
