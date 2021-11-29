package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listener_calc extends calculation implements ActionListener  {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		text1= subversion.input_text.getText();
		if (tar2 != 0) {text2= subversion.input_text.getText();}
		calculate(text1,text2,s1,s2,tar1,tar2,result);
		
		
	}
	

}
