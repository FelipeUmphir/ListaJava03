public class Ex39 {

	public static void main(String[] args) {
		double m = 1;
		for (int i = 1; i < 65; i++) {
			m = m + (Math.pow(2, i));
		}
		
		System.out.println("A quantidade de grãos contidos é: " + m);
	}
}