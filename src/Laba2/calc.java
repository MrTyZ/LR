package Laba2;

public class calc extends calculation{
	static float tar1=0,tar2=0;
	public  calc() {
	
		try {
			String text1=null,text2=null;
			text1= subversion.input_text1.getText();
			if (tar2 != 0) {text2= subversion.input_text2.getText();}
			calculate(text1,text2,tar1,tar2);
		} catch (Exception e) {
			
			e.printStackTrace();
			subversion.label_result.setText("Ошибка ввода");
		}
	}
	

}
