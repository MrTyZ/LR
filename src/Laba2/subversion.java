package Laba2; //����� Java �������

import java.awt.event.ActionListener; //���������� ��� ������� ���������
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {

	protected  JFrame main_GUI;
	protected  JPanel main_panel;
	protected static  subversion student;
	protected static JComboBox combo_student;
		
	public subversion() {
	main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,420,320);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	
	main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �2"); // ����������� ������ ��� �����������
	laba_info.setBounds(120,100,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	//button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("����������");
	button_info.setBounds(30,200,150,40);
	ActionListener info_listener = new info_button();
	button_info.addActionListener(info_listener);
	main_panel.add(button_info);
	
	//Image logo = new Image(); //�������� ��������
	//logo.setSize(180, 100);
	//logo.setLocation(200, 0);
	//main_panel.add(logo);
	
	JMenu menu = new JMenu("�������");
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menu1= new JMenuItem("���������� ������� �����");
	JMenuItem menu2= new JMenuItem("�����");
	
	menu2.addActionListener(actionListener);
	ActionListener logo_image = new ListenerLogo();
	menu1.addActionListener(logo_image);
	
	
	menu.add(menu1);
	menu.add(menu2);
	menuBar.add(menu);
	main_GUI.setJMenuBar(menuBar);
	
	String[] transfer = {"����������� ������� ����� � ������� ������ ����", "����������� ������� ����� � ��������", "����������� ������� ����� � ����� ������� ����"};
	combo_student = new JComboBox(transfer);
	combo_student.setBounds(30,140,350,30);
	ActionListener logo_transfer = new transfer_logo();
	combo_student.addActionListener(logo_transfer);
	
	main_panel.add(combo_student);
	
	
	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
		
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		student = new subversion();
		
	}

}
