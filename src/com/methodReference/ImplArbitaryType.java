package com.methodReference;

public class ImplArbitaryType {

	public static void main(String[] args) {
		
		
		FIArbitarytype fiArbitarytype = ImplArbitaryType::doAddtion;// -> new ImplArbitaryType().doAddition("Soundhara pandiyan"); 
		
		String sp = fiArbitarytype.convertStringToUpper(new ImplArbitaryType(),"Soundhara pandiyan");
		
		System.out.print(sp);

	}
	
	String doAddtion(String str) {
		return str.toUpperCase();
	}

}
