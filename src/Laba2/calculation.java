package Laba2;




public abstract class calculation  {
	
	float s1,s2,tar1,tar2,result;
	String text1,text2;
	
	public void calculate(String text1,String text2,float s1,float s2,float tar1,float tar2,float result) 
	{
		
			s1 = Float.parseFloat(text1);
			s2 = Float.parseFloat(text2);
			result = s1*tar1+ s2*tar2;		
			subversion.label_result.setText("Результат: " + Double.toString(result));
			
	}
}	
	



