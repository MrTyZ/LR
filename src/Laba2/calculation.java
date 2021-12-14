package Laba2;



public abstract class calculation  {
	
	float s1=0,s2=0,result;
	public void calculate(String text1,String text2,float tar1,float tar2)
	{
		
		s1 = Float.parseFloat(text1);
		if (tar2 != 0) {s2 = Float.parseFloat(text2);}
		ICalc lambda =() -> s1*tar1 + s2*tar2;
		result = lambda.getResult();
		subversion.label_result.setText("Результат: " + Float.toString(result));
		
			
	}
	
	public interface ICalc {
		float getResult();
	}
	
	
	
}	
	



 