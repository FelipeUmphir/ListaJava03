import javax.swing.JOptionPane;
public class Ex33 {

	public static void main(String[] args) {
		double s = 0;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for (double i = 1; i < (n + 1); i++) { 
			s = s + 1/i;
		}
		
		System.out.println("O resultado da série é: " + s);
	}
}
