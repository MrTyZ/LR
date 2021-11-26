package Laba2; //����� Java �������

import java.awt.event.ActionListener; //���������� ��� ������� ���������

import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {

	protected  JFrame main_GUI;
	protected  JPanel main_panel;
	protected static  subversion student;
	protected static JTextField input_text;
	protected static JLabel label_result;
		
	public subversion() {
	main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Calculation");
	main_GUI.setBounds(500,400,280,460);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	
	main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �2"); // ����������� ������ ��� �����������
	laba_info.setBounds(20,5,240,30);
	main_panel.add(laba_info);
	
	label_result = new JLabel("���������");
	label_result.setBounds(100,170,300,30);
	main_panel.add(label_result);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(155,360,120,40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("����������");
	button_info.setBounds(5,360,120,40);
	ActionListener info_listener = new info_button();
	button_info.addActionListener(info_listener);
	main_panel.add(button_info);
	
	JButton button_calc = new JButton("������");
	button_calc.setBounds(65,120,150,40);
	ActionListener calculation_listener = new calculation();
	button_calc.addActionListener(calculation_listener);
	main_panel.add(button_calc);
	
	input_text = new JTextField("������� ���-�� �������");
	input_text.setBounds(65, 70, 150, 40);
	main_panel.add(input_text);
	
	JMenu menu = new JMenu("�������");
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menu1= new JMenuItem("����������");
	JMenuItem menu2= new JMenuItem("�����");
	
	menu2.addActionListener(actionListener);
	menu1.addActionListener(info_listener);
	
	
	menu.add(menu1);
	menu.add(menu2);
	menuBar.add(menu);
	main_GUI.setJMenuBar(menuBar);
	

	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
		
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		student = new subversion();
		
	}

}
