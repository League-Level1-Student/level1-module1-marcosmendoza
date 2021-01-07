package _05_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
public static void main(String[] args) {
	
	Vault vault = new Vault();
	Bond bond = new Bond();
	
	int c = bond.findCode(vault);
	JOptionPane.showMessageDialog(null, "The vault code was"+ c);
	
		}
}
