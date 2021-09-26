package com.example.cam;
import java.util.Scanner;

/**
 * Interactive programming RosettaCode.com Challenge
 * Task
 *
 *Show how to start this mode.
 *
 *Then, as a small example of its use, interactively create a function of two strings and a separator 
 *that returns the strings separated by two concatenated instances of the separator   (the 3rd argument). 
 */
public class App 
{

    public static void hello(){
        System.out.println("Bonjour!");
    }


    public void rosettaCodeToString(String word1, String word2, String seperator){
   
        System.out.println("Here is your concatenated results = " + word1 + seperator + seperator + word2);

    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        hello();
        App newApp = new App();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word ");
        String word1 = scanner.nextLine();
        System.out.println("Enter second word ");
        String word2 = scanner.nextLine();
        System.out.println("Enter seperator ");
        String seperator = scanner.nextLine();
        scanner.close();
        newApp.rosettaCodeToString(word1, word2, seperator);
    }
}
