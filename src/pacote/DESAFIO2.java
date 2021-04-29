package pacote;
import javax.swing.JOptionPane;
import java.util.Random;

public class DESAFIO2 {

	public static void main(String[] args) {
		
		String msg0 = 
		JOptionPane.showInputDialog("De um palpite de qual sera o numero sorteado pelo dado.");
	    double palpite = Double.parseDouble(msg0);
			
	    Random r = new Random();
		int oDado = r.nextInt(6)+1; //"nextInt(6)" vai de 0 a 5, por isso soma-se 1.
			
		if (oDado == palpite) {
			JOptionPane.showMessageDialog(null, "Numero sorteado: " + oDado +"\n Palpite correto!");
			
		} else if (palpite >= 1 && palpite <= 6 && palpite != oDado) {
			JOptionPane.showMessageDialog(null, "Numero sorteado: " + oDado +"\n Palpite incorreto.");
			
		} else {
			JOptionPane.showMessageDialog(null, "Isso nao eh um numero de 1 a 6.");
		}
	
	}

}