import javax.swing.JOptionPane;
public class Ex40 {

	public static void main(String[] args) {
		int z; 
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor: "));
		
		if (x > y) {
			z = x;
			x = y;
			y = z;
		}
		
		System.out.println("Os números primos exitentes entre esses valores são:");
		for (int n = x + 1; n < y; n++) {
			boolean p = true;
			
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						p = false;
					    break;
					}
				}
				
				if (p == true) {
					System.out.println(n);
				}
		}
	}
}