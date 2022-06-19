package com.learning.service;

import java.util.Random;

import com.learning.model.EmployeeDetails;

public class CredentialService {
public char[] generatePassword() {
	String strCapitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String strSmallLetters="abcdefghijklmnopqrstuvwxyz";
	String strNumber="0123456789";
	String strSpCharacters="!@#$%^&*()_+=-";
	
	String strValues=strCapitalLetters+strSmallLetters+strNumber+strSpCharacters;
	
	Random rd= new Random();
	
	char [] password = new char[8];
	for(int i=0;i<8;i++) {
	password[i]=strValues.charAt(rd.nextInt(strValues.length()));
	}
	
	
	
	return password;
	
}
public String generateMailId(String strFirstName,String strLastName, String strDepartment)
{
	String strEmailId=strFirstName+strLastName+"@"+strDepartment+".abc.com";
	return strEmailId;
	
}

public void showCredentials(EmployeeDetails empDetails,String strEmailId, char[] password) {
	System.out.println("Dear  " + empDetails.getStrFirstName()+ " "+ empDetails.getStrLastName()+ " yours ");
System.out.println("Email Id is "+strEmailId);
System.out.println("password is ");
System.out.println(password);


}

}
