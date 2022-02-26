// A calculator that generates random numbers and a random operator
// Made by Luke Johnson (https://github.com/LukeMaster06)

import java.util.concurrent.ThreadLocalRandom;

public class RandCal {
  public static void main(String[] args) {
    // Clears the console
    System.out.println("\033[H\033[2J");
    System.out.flush();

    // Generates the random numbers needed for the program
    int rand1 = (int) (Math.random() * 1001);
    int rand2 = (int) (Math.random() * 1001);
    int randOperator = ThreadLocalRandom.current().nextInt(1, 5 + 1);
    int outcome = 0;

    // Displays the random numbers generated (besides randOperator)
    System.out.println("First random number: " + rand1);
    System.out.println("Second random number: " + rand2);

    // Displays the operator chosen, runs the calculation, and displays the outcome
    switch (randOperator) {
      case 1:
        System.out.println("Random operator: addition");
        System.out.println(" ");
        outcome = rand1 + rand2;
        System.out.println("Answer: " + outcome);
        break;
      case 2:
        System.out.println("Random operator: subtraction");
        System.out.println(" ");
        outcome = rand1 - rand2;
        System.out.println("Answer: " + outcome);
        break;
      case 3:
        System.out.println("Random operator: multiplication");
        System.out.println(" ");
        outcome = rand1 * rand2;
        System.out.println("Answer: " + outcome);
        break;
      case 4:
        System.out.println("Random operator: division");
        System.out.println(" ");
        outcome = rand1 / rand2;
        System.out.println("Answer: " + outcome);
        break;
      case 5:
        System.out.println("Random operator: modulus");
        System.out.println(" ");
        outcome = rand1 % rand2;
        System.out.println("Answer: " + outcome);
    }
  }
}