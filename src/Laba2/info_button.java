package Laba2;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class info_button implements ActionListener {


	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			
		JFrame info_GUI = new JFrame("info_button");	// создание графического окна
		info_GUI.setTitle ("Информация о команде");
		info_GUI.setBounds(500,400,400,250);
		info_GUI.setResizable(false); // фиксированный размер окна
		
		JPanel info_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		info_panel.setLayout(null);
		info_GUI.add(info_panel);
		
		JLabel info1 = new JLabel("Ермолаев Дмитрий Андреевич - 19130110");
		info1.setBounds(50,50,350,30);
		JLabel info2 = new JLabel("Судаков Евгений Станиславович - 19130096");
		info2.setBounds(50,100,350,30);
		
		
		info_panel.add(info1);
		info_panel.add(info2);
		
		
		JButton button_exit = new JButton("Назад"); // добавляем кнопку
		button_exit.setBounds(270,150,100,40);
		button_exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                info_GUI.dispose();
           }
      });
		info_panel.add(button_exit);
		
		
		
		info_GUI.setVisible(true);
		
	}

}
