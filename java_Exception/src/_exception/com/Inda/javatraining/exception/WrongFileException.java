package _exception.com.Inda.javatraining.exception;

public class WrongFileException extends Exception {
	
	public static final long serialVersionUID = 42L;

	
	@Override
	public String getMessage() {
		return "Your chose the worong file!";
	}
}
