package using_Assert.com.lynda.javatraining.calc;

public class Calculator2 {

	public static void main(String[] args) {
		
		
		String string1 = InputHelper.getInput("Enter a numeric value: ");
		assert checkInput(string1);
		String string2 = InputHelper.getInput("Enter a numeric value: ");
		assert checkInput(string2);
		String op = InputHelper.getInput("Enter + or - or * or / ");
		
		double result = 0;
		
		switch (op) {
		case "+":
			result = MathHelper.addValues(string1, string2);
			break;
		case "-":
			result = MathHelper.subtractValues(string1, string2);
			break;
		case "*":
			result = MathHelper.multiplyValues(string1, string2);
			break;
		case "/":
			result = MathHelper.divideValues(string1, string2);
			break;

		default:
			System.out.println("You entered an incorrect operator");
			return;
		}
		
		System.out.println("The answer is " + result);
	}
	
	private static boolean checkInput(String s){
		
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
