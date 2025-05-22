/*Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
package stringexercise1;
import java.util.Scanner;

public class StringCountwords {
	
	    // User-defined function to count the number of words in a string
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }

	        // Split the string by one or more spaces/tabs/newlines
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int wordCount = countWords(input);

	        System.out.println("Number of words in the string: " + wordCount);

	        scanner.close();
	    }
	}

	


