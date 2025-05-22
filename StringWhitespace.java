/* Write a Java Program for Eliminating all whitespace characters from a string using user defined
	function removeWhitespace()*/
package stringexercise;
import java.util.Scanner;
public class StringWhitespace {
	

	    // User-defined function to remove all whitespace characters from a string
	    public static String removeWhitespace(String str) {
	        if (str == null) {
	            return null;
	        }

	        // Replace all whitespace characters using regex \s
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string with whitespace: ");
	        String input = scanner.nextLine();

	        String result = removeWhitespace(input);

	        System.out.println("String after removing all whitespace: " + result);

	        scanner.close();
	    }
	}
