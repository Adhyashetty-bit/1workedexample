/*Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package stringexercise1;
import java.util.Scanner;
public class StringCapitalize {
	
	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        String[] words = str.trim().split("\\s+"); // Split by one or more whitespace characters
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first character and append the rest
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }

	        return result.toString().trim(); // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String capitalized = capitalizeWords(input);

	        System.out.println("Capitalized String: " + capitalized);

	        scanner.close();
	    }
	}



