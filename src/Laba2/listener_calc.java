package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listener_calc implements ActionListener  {
	Tarif tarif = new Tarif();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (tarif.getTar2() == 0) {
			new calc(subversion.input_text1.getText(),tarif.getTar1());}
		else {
			new calc(subversion.input_text1.getText(),subversion.input_text2.getText(),tarif.getTar1(),tarif.getTar2());
		}

	

}
}
