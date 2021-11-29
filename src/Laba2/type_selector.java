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
			tar1 = 3.33f; tar2 = 0; 
			subversion.student.main_panel.remove(subversion.input_text2);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Городской населенный пункт, дифференцированный тариф":
		{
			tar1 = 3.83f; tar2 = 2.66f; 
			subversion.student.main_panel.add(subversion.input_text2);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Сельское население, одноставочный тариф":
		{
			tar1 = 2.33f; tar2 = 0;
			subversion.student.main_panel.remove(subversion.input_text2);
			subversion.student.main_panel.repaint();
			
		}
		break;
		case "Сельское население, дифференцированный тариф":
		{
			tar1 = 2.68f; tar2 = 1.86f;
			subversion.student.main_panel.add(subversion.input_text2);
			subversion.student.main_panel.repaint();
			
		}
		break;
		
		}

		
		

		
	
	
	}
	
	
}
