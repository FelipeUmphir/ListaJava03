import javax.swing.JOptionPane;
public class Ex34 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.println("A tabuada do " + n + " é:");
		
		for (int i = 0; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}