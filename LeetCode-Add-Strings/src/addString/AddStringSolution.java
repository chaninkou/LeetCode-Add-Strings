package addString;

public class AddStringSolution {
	    public String addStrings(String num1, String num2) {
	        StringBuilder sum = new StringBuilder();
	        
	        int carry = 0;
	        int x;
	        int y;
	        
	        // Work from last element
	        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
	            if(i < 0){
	                x = 0;
	            } else {
	                x = num1.charAt(i) - '0';
	            }
	            
	            if(j < 0){
	                y = 0;
	            } else {
	                y = num2.charAt(j) - '0';
	            }
	            
	            sum.append((x + y + carry) % 10);
	            
	            carry = (x + y + carry) / 10;
	            
	        }
	        
	        return sum.reverse().toString();
	    }
}
