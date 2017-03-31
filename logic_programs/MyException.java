package logic_programs;

public class MyException extends Exception {
	public MyException(){
		
	}
	
	public MyException(String message){
		System.out.println(message);
	}
}
