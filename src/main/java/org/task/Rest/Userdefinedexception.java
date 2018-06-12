package org.task.Rest;

public class Userdefinedexception extends Exception{
	public String getMessage(){
		return "UserdefinedMessageThis is a ";
	}
	public static void main(String[] args) throws Userdefinedexception {
		throw new Userdefinedexception();
		
	}

}
