package caserCipher;
import java.util.Scanner;

public class caser {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		System.out.println(caesar(a,3));
	}
	
	static String caesar(String value, int shift) {
        // Convert to char array.
        char[] buffer = value.toCharArray();

        // Loop over characters.
        for (int i = 0; i < buffer.length; i++) {

            // Shift letter
            char letter = buffer[i];
            letter = (char) (letter + shift);
            if (letter > 'z') {
                letter = (char) (letter - 26);
            } else if (letter < 'a') {
                letter = (char) (letter + 26);
            }
            buffer[i] = letter;
        }
        // Return final string.
        return new String(buffer);
	}
	}
