// A simple calculator using the Scanner utility
// Made by Luke Johnson (https://github.com/LukeMaster06)

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Calculator {
  public static void main(String[] args) throws InterruptedException {
    Scanner inputObj = new Scanner(System.in);

    // Clears the console
    System.out.println("\033[H\033[2J");
    System.out.flush();

    // Displays the header and first question
    System.out.println("-- CALCULATOR IN JAVA --");
    System.out.println("What is the first number to calculate?");

    String firstStr = inputObj.nextLine();   // String variable that stores first number
    System.out.println(" ");   // Skips line after input provided
    System.out.println("What is the second number to calculate?");   // Asks for a second number to use
    
    String secondStr = inputObj.nextLine();
    System.out.println(" ");

    // Displays what the user entered and asks what operation should be used
    System.out.println("You typed in " + firstStr + " and " + secondStr + ". What operation should be used?");
    System.out.println(" ");

    // Displays the different types of operators and asks for user input
    int operatorInt = 0;
    System.out.println("Type \"add\" to use addition.");
    System.out.println("Type \"sub\" to use subtraction.");
    System.out.println("Type \"multi\" to use multiplication.");
    System.out.println("Type \"div\" to use division.");
    System.out.println("Type \"mod\" to use modulus.");

    // Assigns a number to a variable depending on which operator the user selects
    String calOperator = inputObj.nextLine();
    switch (calOperator) {
      case "add":
        operatorInt = 1;
        break;
      case "sub":
        operatorInt = 2;
        break;
      case "multi":
        operatorInt = 3;
        break;
      case "div":
        operatorInt = 4;
        break;
      case "mod":
        operatorInt = 5;
        break;
      default:
        System.out.println("Sorry, but that isn't an operator that we use.");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.exit(0);
    }

    // Changes string variable to integer variable
    int firstNum = Integer.parseInt(firstStr);
    int secondNum = Integer.parseInt(secondStr);
    int outcome = 0;

    System.out.println(" ");
    System.out.println("Alright! Calculation in progress...");
    System.out.println(" ");

    // Calculates the two numbers
    switch (operatorInt) {
      case 1:
        outcome = firstNum + secondNum;
        System.out.println("Complete! Answer: " + outcome + ".");
        break;
      case 2:
        outcome = firstNum - secondNum;
        System.out.println("Complete! Answer: " + outcome + ".");
        break;
      case 3:
        outcome = firstNum * secondNum;
        System.out.println("Complete! Answer: " + outcome + ".");
        break;
      case 4:
        outcome = firstNum / secondNum;
        System.out.println("Complete! Answer: " + outcome + ".");
        break;
      case 5:
        outcome = firstNum % secondNum;
        System.out.println("Complete! Answer: " + outcome + ".");
        break;
    }
  }
}