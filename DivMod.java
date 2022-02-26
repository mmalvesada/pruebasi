// Calculator that combines the division and modulus outcome in the end
// Made by Luke Johnson (https://github.com/LukeMaster06)

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DivMod {
  public static void main(String[] args) {
    Scanner inputObj = new Scanner(System.in);

    // Clears the console
    System.out.println("\033[H\033[2J");
    System.out.flush();

    // Header and first question
    System.out.println("-- DIVISION and MODULUS CALCULATOR --");
    System.out.println("What is the first number to calculate?");
    String firstStr = inputObj.nextLine();
    
    // Second question
    System.out.println(" ");
    System.out.println("What is the second number to calculate?");
    String secondStr = inputObj.nextLine();

    // Displays what the user put in and announces the calculation process has begun
    System.out.println(" ");
    System.out.println("You typed in " + firstStr + " and " + secondStr + ".");
    System.out.println("Calculating...");
    System.out.println(" ");

    // Parses the string input into useable integers
    int firstNum = Integer.parseInt(firstStr);
    int secondNum = Integer.parseInt(secondStr);

    // Declares the variables that store the outcomes of the calculations
    int divOutcome = firstNum / secondNum;
    int modOutcome = firstNum % secondNum;

    // Announces the completion of the calculation and shows the outcome
    System.out.println("Calculation complete!");
    System.out.println("Answer: " + divOutcome + " with a remainder of " + modOutcome);
  }
}