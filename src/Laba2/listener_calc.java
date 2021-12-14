package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listener_calc implements ActionListener  {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (calc.tar2 == 0) {
			new calc(subversion.input_text1.getText(),calc.tar1);}
		else {
			new calc(subversion.input_text1.getText(),subversion.input_text2.getText(),calc.tar1,calc.tar2);
		}

	

}
}
