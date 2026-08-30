import javax.swing.JOptionPane;
public class Ex36 {

	public static void main(String[] args) {
		int m = 1, o = 1;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for (int i = 1; i > n+1; i++) {
			o = o * i;
			m = m + 1/o;
		}
		
		System.out.println("O resultado da série é: " + m);
	}
}