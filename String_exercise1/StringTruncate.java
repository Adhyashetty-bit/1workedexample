/* Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package stringexercise1;
import java.util.Scanner;
public class StringTruncate {
	

	    // User-defined function to truncate a string and add ellipsis if necessary
	    public static String truncate(String str, int maxLength) {
	        if (str == null) {
	            return null;
	        }

	        // If string is shorter than or equal to maxLength, return it as-is
	        if (str.length() <= maxLength) {
	            return str;
	        }

	        // If maxLength is less than 3, return substring with no room for ellipsis
	        if (maxLength <= 3) {
	            return str.substring(0, maxLength);
	        }

	        // Truncate and append "..."
	        return str.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the string to truncate: ");
	        String input = scanner.nextLine();

	        System.out.print("Enter the maximum length: ");
	        int maxLength = scanner.nextInt();

	        String result = truncate(input, maxLength);

	        System.out.println("Truncated String: " + result);

	        scanner.close();
	    }
	}



