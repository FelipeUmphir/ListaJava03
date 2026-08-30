import javax.swing.JOptionPane;
public class Ex44 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
		
		System.out.println("O resultado da exponenciação é: " + (Math.pow(n, e)));
	}
}