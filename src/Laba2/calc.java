package Laba2;

public class calc extends calculation{
	static float tar1=0,tar2=0;
	private String text11=null,text22=null;
	public  calc(String text1, float tar1) {
	this.text11=text1;
		try {
			
			calculate(text11,null,tar1,0);
		} catch (Exception e) {
			
			e.printStackTrace();
			subversion.label_result.setText("Ошибка ввода");
		}
	}
	public  calc(String text1, String text2, float tar1, float tar2) {
		this.text11=text1;
		this.text22=text2;
		try {
			calculate(text11,text22,tar1,tar2);
		} catch (Exception e) {
			
			e.printStackTrace();
			subversion.label_result.setText("Ошибка ввода");
		}
	}
	

}
