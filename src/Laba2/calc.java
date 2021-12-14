package Laba2;

public class calc extends calculation{
	static float tar1=0,tar2=0;
	public  calc(String text1, float tar1) {
		try {
			
			calculate(text1,null,tar1,0);
		} catch (Exception e) {
			
			e.printStackTrace();
			subversion.label_result.setText("Ошибка ввода");
		}
	}
	public  calc(String text1, String text2, float tar1, float tar2) {
		try {
			calculate(text1,text2,tar1,tar2);
		} catch (Exception e) {
			
			e.printStackTrace();
			subversion.label_result.setText("Ошибка ввода");
		}
	}
	

}
