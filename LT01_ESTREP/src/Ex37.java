import javax.swing.JOptionPane;
public class Ex37 {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 0;
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.println("A série de Fibonacci até o termo " + n + "é:");
		
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			c = a;
			a = b;
			b = c + b;
		}
	}
}
