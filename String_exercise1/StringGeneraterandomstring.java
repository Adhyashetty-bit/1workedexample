/*Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package stringexercise1;
import java.util.Random;
import java.util.Scanner;
public class StringGeneraterandomstring {
	
	    // User-defined function to generate a random string of a given length
	    public static String generateRandomString(int length) {
	        if (length <= 0) {
	            return "";
	        }

	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder result = new StringBuilder(length);
	        Random random = new Random();

	        // Generate random characters
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            result.append(characters.charAt(index));
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the desired length of the random string: ");
	        int length = scanner.nextInt();

	        String randomString = generateRandomString(length);

	        System.out.println("Generated Random String: " + randomString);

	        scanner.close();
	    }
	}



