import java.util.Scanner;

public class AllNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = n * (n + 1) / 2;
        System.out.println(result);
    }
}
