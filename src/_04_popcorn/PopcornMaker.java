package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
    public static void main(String args[])  {
    	
    		String flavor = JOptionPane.showInputDialog("what flavor of popcorn do you want?");
 Popcorn popcorn = new Popcorn(flavor);
   	    	Microwave microwave = new Microwave();
   	
   	String time  = JOptionPane.showInputDialog("how much minutes do you want your popcorn to cook?");
   	microwave.putInMicrowave(popcorn);
   	    int timeint = Integer.parseInt(time);
   	microwave.setTime(timeint);
   	microwave.startMicrowave();
}
}
