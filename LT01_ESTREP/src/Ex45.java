public class Ex45 {

	public static void main(String[] args) {
		double s = 1, n = 2;
		
		while (n < 16) {
			if (n % 2 == 0) {
				s = s - (n/Math.pow(n, 2));
			}
			
			else {
				s = s + (n/Math.pow(n, 2));
			}
		}
		
		System.out.println("O resultado da série é: " + s);
	}
}