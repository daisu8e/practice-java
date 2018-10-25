import java.util.Scanner;

public class DecToHex {
  public static void main(String[] args) {

    System.out.print("Enter a decimal number: ");
    Scanner input = new Scanner(System.in);
    int decimal = input.nextInt();

    String hex = "";

    while (decimal != 0) {
      int hexValue = decimal % 16;
      char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
      hex = hexDigit + hex;
      decimal = decimal / 16;
    }

    System.out.println("The hex number is " + hex);
  }
}
