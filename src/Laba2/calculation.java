package Laba2;


public abstract class calculation  {
	
	
	public void calculate(String text1,String text2,float tar1,float tar2) 
	{
		 	float s1=0,s2=0,result=0;
			s1 = Float.parseFloat(text1);
			if (tar2 != 0) {s2 = Float.parseFloat(text2);}			
			result = s1*tar1 + s2*tar2;				
			subversion.label_result.setText("Результат: " + Float.toString(result));
			
	}
}	
	



