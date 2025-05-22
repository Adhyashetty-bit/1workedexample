/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
package stringexercise1;
import java.util.Scanner;

public class StringIsnumeric {
	
	    // User-defined function to check if a string contains only numeric characters
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }

	        // Check each character
	        for (int i = 0; i < str.length(); i++) {
	            if (!Character.isDigit(str.charAt(i))) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to check if it's numeric: ");
	        String input = scanner.nextLine();

	        if (isNumeric(input)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string does NOT contain only numeric characters.");
	        }

	        scanner.close();
	    }
	}



