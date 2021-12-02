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
		
		switch (item) {
		
		case "Городской населенный пункт, одноставочный тариф":
		{
			calc.tar1 = 3.33f; calc.tar2 = 0; 
			subversion.student.main_panel.remove(subversion.input_text2);
			subversion.student.main_panel.remove(subversion.text2_label);
			subversion.student.main_panel.add(subversion.input_text1);
			subversion.student.main_panel.add(subversion.text1_label);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Городской населенный пункт, дифференцированный тариф":
		{
			calc.tar1 = 3.83f; calc.tar2 = 2.66f; 
			subversion.student.main_panel.add(subversion.input_text1);
			subversion.student.main_panel.add(subversion.text1_label);
			subversion.student.main_panel.add(subversion.input_text2);
			subversion.student.main_panel.add(subversion.text2_label);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Сельское население, одноставочный тариф":
		{
			calc.tar1 = 2.33f; calc.tar2 = 0;
			subversion.student.main_panel.remove(subversion.input_text2);
			subversion.student.main_panel.remove(subversion.text2_label);
			subversion.student.main_panel.add(subversion.input_text1);
			subversion.student.main_panel.add(subversion.text1_label);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Сельское население, дифференцированный тариф":
		{
			calc.tar1 = 2.68f; calc.tar2 = 1.86f;
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
