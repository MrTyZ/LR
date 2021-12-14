package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class type_selector extends calculation implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox box = (JComboBox)e.getSource();
		String item = (String)box.getSelectedItem();	
		Tarif tarif = new Tarif();
		switch (item) {
		
		case "Городской населенный пункт, одноставочный тариф":
		{
			tarif.setTar1(3.33f);tarif.setTar2(0);
			subversion.student.main_panel.remove(subversion.input_text2);
			subversion.student.main_panel.remove(subversion.text2_label);
			subversion.student.main_panel.add(subversion.input_text1);
			subversion.student.main_panel.add(subversion.text1_label);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Городской населенный пункт, дифференцированный тариф":
		{
			tarif.setTar1(3.83f);tarif.setTar2(2.66f);
			subversion.student.main_panel.add(subversion.input_text1);
			subversion.student.main_panel.add(subversion.text1_label);
			subversion.student.main_panel.add(subversion.input_text2);
			subversion.student.main_panel.add(subversion.text2_label);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Сельское население, одноставочный тариф":
		{
			tarif.setTar1(2.33f);tarif.setTar2(0);
			subversion.student.main_panel.remove(subversion.input_text2);
			subversion.student.main_panel.remove(subversion.text2_label);
			subversion.student.main_panel.add(subversion.input_text1);
			subversion.student.main_panel.add(subversion.text1_label);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Сельское население, дифференцированный тариф":
		{
			tarif.setTar1(2.68f);tarif.setTar2(1.86f);
			subversion.student.main_panel.add(subversion.input_text1);
			subversion.student.main_panel.add(subversion.text1_label);
			subversion.student.main_panel.add(subversion.input_text2);
			subversion.student.main_panel.add(subversion.text2_label);
			subversion.student.main_panel.repaint();
			
		}
		break;
		
		default:{
			subversion.student.main_panel.remove(subversion.input_text1);
			subversion.student.main_panel.remove(subversion.text1_label);
			subversion.student.main_panel.remove(subversion.input_text2);
			subversion.student.main_panel.remove(subversion.text2_label);
			subversion.student.main_panel.repaint();
		}
		}
		
		
		

		
	
	
	}
	
	
}
