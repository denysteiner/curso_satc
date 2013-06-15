import javax.swing.JOptionPane;

public class TesteJOptionPane{

	public static void main(String[] args){
		String name = "";
		name = JOptionPane.showInputDialog("Entre com o seu nome:");
		String msg = "Ola " + name + "!";
		JOptionPane.showMessageDialog(null, msg);
	}
	
}