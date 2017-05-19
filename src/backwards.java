import javax.swing.JOptionPane;

public class backwards {

	public static void main(String[] args) {
		String Text ="";

		
		Text = JOptionPane.showInputDialog("Text:");
		
		String reverse = new StringBuffer(Text).reverse().toString();
		
		JOptionPane.showMessageDialog(null, reverse);


	}

}
