package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class transfer_logo implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JComboBox box = (JComboBox)e.getSource();
		String item = (String)box.getSelectedItem();
		
		if(ListenerLogo.logo==null) 
		{}
		else
		{
        
		if (item=="Переместить логотип УГАТУ в верхний правый угол") 
		{
			ListenerLogo.logo.setSize(180, 100);
			ListenerLogo.logo.setLocation(200, 0);
			subversion.student.main_panel.repaint(); //перерисовка JPanel			
		}
		
		if (item=="Переместить логотип УГАТУ в середину") 
		{
			ListenerLogo.logo.setSize(180, 100);
			ListenerLogo.logo.setLocation(100, 0);
			subversion.student.main_panel.repaint(); //перерисовка JPanel
		}
		
		if (item=="Переместить логотип УГАТУ в левый верхний угол") 
		{
			ListenerLogo.logo.setSize(180, 100);
			ListenerLogo.logo.setLocation(0, 0);
			subversion.student.main_panel.repaint(); //перерисовка JPanel
		}
		

		}
	}

}
