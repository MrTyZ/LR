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
			
		JFrame info_GUI = new JFrame("info_button");	// �������� ������������ ����
		info_GUI.setTitle ("���������� � �������");
		info_GUI.setBounds(500,400,400,300);
		info_GUI.setResizable(false); // ������������� ������ ����
		
		JPanel info_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
		info_panel.setLayout(null);
		info_GUI.add(info_panel);
		
		JLabel info1 = new JLabel("��� - ����� �������� ������");
		info1.setBounds(50,50,200,30);
		JLabel info2 = new JLabel("��� - ����� �������� ������");
		info2.setBounds(50,100,200,30);
		JLabel info3 = new JLabel("��� - ����� �������� ������");
		info3.setBounds(50,150,200,30);
		
		info_panel.add(info1);
		info_panel.add(info2);
		info_panel.add(info3);
		
		JButton button_exit = new JButton("�����"); // ��������� ������
		button_exit.setBounds(270,200,100,40);
		button_exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                info_GUI.dispose();
           }
      });
		info_panel.add(button_exit);
		
		
		
		info_GUI.setVisible(true);
		
	}

}
