import javax.swing.JOptionPane;
public class Ex38 {

	public static void main(String[] args) {
		int ma = 0, me = 0, n = 0;
		
		while (n < 100) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
			
			if (x > ma) {
				ma = x;
			}
			
			if (x < me) {
				me = x;
			}
		    
			else if (me == 0) {
				me = x;
			}
		    
			n = n + 1;
		}
		
		System.out.println("O maior valor digitado é " + ma + " e o menor é " + me);
	}
}