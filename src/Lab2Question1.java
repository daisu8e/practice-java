import java.util.Scanner;
import java.util.ArrayList;

public class Lab2Question1 {

  public static void main(String... args) {

    int lottery = (int)(Math.random() * 1000);

    System.out.println("Enter your guess numbers of three digits.");
    Scanner input = new Scanner(System.in);
    int guess = input.nextInt();

    if (canMatchAllExactly(lottery, guess)) {
      System.out.println("Lottery is " + lottery + ". You won $1,000,000.");

    } else if (canMatchAll(lottery, guess)) {
      System.out.println("Lottery is " + lottery + ". You won $30,000.");

    } else if (canMatchAtLeastOne(lottery, guess)) {
      System.out.println("Lottery is " + lottery + ". You won $10,000.");

    } else {
      System.out.println("Lottery is " + lottery + ". No matching number found.");
    }
  }

  private static boolean canMatchAllExactly(int lottery, int guess) {
    return lottery == guess;
  }

  private static boolean canMatchAll(int lottery, int guess) {
    int[] lotteryNumbers = arrayOf(lottery);
    int[] guessNumbers = arrayOf(guess);
    boolean result = true;
    for (int i = 0; i < lotteryNumbers.length; i++) {
      boolean matches = false;
      for (int j = 0; j < guessNumbers.length; j++) {
        if (lotteryNumbers[i] == guessNumbers[j]) {
          matches = true;
          break;
        }
      }
      if (!matches) {
        result = false;
        break;
      }
    }
    return result;
  }

  private static boolean canMatchAtLeastOne(int lottery, int guess) {
    int[] lotteryNumbers = arrayOf(lottery);
    int[] guessNumbers = arrayOf(guess);
    boolean result = false;
    for (int i = 0; i < lotteryNumbers.length; i++) {
      for (int j = 0; j < guessNumbers.length; j++) {
        if (lotteryNumbers[i] == guessNumbers[j]) {
          result = true;
          break;
        }
      }
      if (result) break;
    }
    return result;
  }

  private static int[] arrayOf(int number) {
    int[] array = {number / 100, number % 100 / 10, number % 100 % 10};
    return array;
  }
}
