package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class calculation implements ActionListener  {
	
	@Override
	public void actionPerformed(ActionEvent a) {
		
		try {
			String text= subversion.input_text.getText();
			float s = Float.parseFloat(text);
			float result = 2.22f * s;
			subversion.label_result.setText("Результат: " + Float.toString(result));
		} catch (NumberFormatException e) {
			
			subversion.label_result.setText("Ошибка ввода");
			e.printStackTrace();
		}
		
	}

}

