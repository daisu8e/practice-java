import java.util.Scanner;
import java.util.ArrayList;

public class Lab2Question1V2 {

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
    ArrayList<Integer> lotteryNumbers = arrayOf(lottery);
    ArrayList<Integer> guessNumbers = arrayOf(guess);
    return lotteryNumbers.containsAll(guessNumbers);
  }

  private static boolean canMatchAtLeastOne(int lottery, int guess) {
    ArrayList<Integer> lotteryNumbers = arrayOf(lottery);
    ArrayList<Integer> guessNumbers = arrayOf(guess);
    for (Integer guessNumber : guessNumbers) {
      if (lotteryNumbers.contains(guessNumber)) return true;
    }
    return false;
  }

  private static ArrayList<Integer> arrayOf(int number) {
    ArrayList<Integer> array = new ArrayList<>();
    array.add(number / 100);
    array.add(number % 100 / 10);
    array.add(number % 100 % 10);
    return array;
  }
}

