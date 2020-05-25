/* This program takes a text and a key from the user and ciphers the text with Caesar Cipher and changes the text
based on the key and displays it but the program only changes the letters when ciphering the text
 */

import java.util.Scanner;
public class CaesarEncryptionDevice {
    public static void main(String[] Args) {
        //Asks for the text they want to get ciphered and stores it in Input
        System.out.print("Enter the text to be ciphered: ");
        Scanner userInput = new Scanner(System.in);
        String Input = userInput.nextLine();
        System.out.println();

        //Ask for the key they want to get ciphered and stores it in Key
        System.out.print("Enter the key: ");
        Scanner userKey = new Scanner(System.in);
        int Key = userKey.nextInt();
        System.out.println();

        //Declares InputChar Arrays which is filled with the characters of the Input String
        char InputChar[] = new char[Input.length()];
        for (int Counter = 0; Counter < InputChar.length; Counter++) {
            InputChar[Counter] = Input.charAt(Counter);
        }

        //Changes the characters based on the key and displays it
        for (int Counter = 0; Counter < InputChar.length; Counter++) {
            //If the character is a letter, it changes the character based on the key and displays it
            if (InputChar[Counter] >= '@' && InputChar[Counter] < 'z') {
                InputChar[Counter] += Key;
                System.out.print(InputChar[Counter]);
            } else { //Else doesn't change the character since it's not a letter and displays it
                System.out.print(InputChar[Counter]);
            }
        }
        System.out.println();
    }
}