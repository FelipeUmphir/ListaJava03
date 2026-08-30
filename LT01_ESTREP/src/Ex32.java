import javax.swing.JOptionPane;
public class Ex32 {

	public static void main(String[] args) {
		int r = 1;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for (int i = n; i > 1; i--) {
			r = (r * i);
		}
		
		System.out.println("O fatorial desse número é: " + r);
	}
}