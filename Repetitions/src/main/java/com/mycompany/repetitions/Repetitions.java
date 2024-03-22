/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repetitions;
import java.util.Scanner;

/**
 *
 * @author Acer-User
 */
public class Repetitions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
       detectSuccessiveRepeatedLetters(word);
        
    }
    public static void detectSuccessiveRepeatedLetters(String word) {
        char[] letters = word.toCharArray();
        boolean foundRepeated = false;

        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] == letters[i + 1]) {
                System.out.println("Successive repeated occurrence of letter '" + letters[i] + "' found.");
                foundRepeated = true;
            }
        }
         if (!foundRepeated) {
            System.out.println("No successive repeated occurrence of letters found.");
        }
}
    
    
}
