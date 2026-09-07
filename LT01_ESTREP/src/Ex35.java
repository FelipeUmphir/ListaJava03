import javax.swing.JOptionPane;
public class Ex35 {

	public static void main(String[] args) {
		int z, m = 0;
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor: "));
		
		if (x > y) {
			z = x;
			x = y;
			y = z;
		}
		
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				m = m + i;
			}
		}
		
		System.out.println("O resultado da somatória dos números ímpares entre esses valores é: " + m);
	}
}
