package leetcode415;

public class Main {
	public static void main(String[] args) {
		String num1 = "923";
		
		String num2 = "123";
		
		System.out.println("Input: " + num1 + " + " + num2);
		
		AddStringSolution solution = new AddStringSolution();
		
		System.out.println("Solution: " + solution.addStrings(num1, num2));
	}
}
