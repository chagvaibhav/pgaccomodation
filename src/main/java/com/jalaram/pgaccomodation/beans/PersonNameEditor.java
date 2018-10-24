package com.jalaram.pgaccomodation.beans;

import java.beans.PropertyEditorSupport;

public class PersonNameEditor extends PropertyEditorSupport{

	//When you willl submit the persion form--> 
	//Spring MVC will run setAsText  function of this class -- > 
	//Before performing data binding task for the firstName property of person class
	
	@Override
	public void setAsText(String firtName) throws IllegalArgumentException {
		if (firtName.contains("Mr.") || firtName.contains("Ms.")){
			setValue(firtName);
		}else{
			firtName = "Ms." + firtName;
			
			setValue(firtName);
		}
	}
}
