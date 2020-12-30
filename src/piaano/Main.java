package piaano;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		Piano piano = new Piano();
		SwingUtilities.invokeLater(piano);
	}
}
