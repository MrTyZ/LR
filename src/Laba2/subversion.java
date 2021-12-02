package Laba2; //пакет Java классов

import java.awt.event.ActionListener; //библиотека для события слушателя

import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {

	protected  JFrame main_GUI;
	protected  JPanel main_panel;
	protected static  subversion student;
	protected static JTextField input_text1;
	protected static JTextField input_text2;
	protected static JLabel label_result;
	protected static JComboBox combo_selector;
	protected static JLabel text2_label;
	protected static JLabel text1_label;
		
	public subversion() {
	main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Calculation");
	main_GUI.setBounds(500,400,280,460);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	
	main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
	laba_info.setBounds(20,5,240,30);
	main_panel.add(laba_info);
	
	label_result = new JLabel("Результат");
	label_result.setBounds(100,320,300,30);
	main_panel.add(label_result);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(155,360,120,40);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JButton button_info = new JButton("Информация");
	button_info.setBounds(5,360,120,40);
	ActionListener info_listener = new info_button();
	button_info.addActionListener(info_listener);
	main_panel.add(button_info);
	
	JButton button_calc = new JButton("Расчет");
	button_calc.setBounds(65,270,150,40);
	ActionListener calc_listener = new listener_calc();
	button_info.addActionListener(calc_listener);
	main_panel.add(button_calc);
	
	text1_label = new JLabel("Введите кол-во кВТ:"); 
	text1_label.setBounds(20,140,250,20);
	
	input_text1 = new JTextField("");
	input_text1.setBounds(75, 160, 130, 40);
	
	text2_label = new JLabel("Введите кол-во кВТ за ночь:");
	text2_label.setBounds(20,200,250,20);
	
	input_text2 = new JTextField("");
	input_text2.setBounds(75, 220, 130, 40);
	
	JMenu menu = new JMenu("Главная");
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menu1= new JMenuItem("Информация");
	JMenuItem menu2= new JMenuItem("Выход");
	
	String[] selector = {"","Городской населенный пункт, одноставочный тариф", "Городской населенный пункт, дифференцированный тариф", "Сельское население, одноставочный тариф", "Сельское население, дифференцированный тариф"};
	combo_selector = new JComboBox(selector);
	combo_selector.setBounds(5,35,270,30);
	ActionListener selector_type = new type_selector();
	combo_selector.addActionListener(selector_type);	
	main_panel.add(combo_selector);
	
	menu2.addActionListener(actionListener);
	menu1.addActionListener(info_listener);
	
	
	menu.add(menu1);
	menu.add(menu2);
	menuBar.add(menu);
	main_GUI.setJMenuBar(menuBar);
	

	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
		
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		student = new subversion();
		
	}

}
