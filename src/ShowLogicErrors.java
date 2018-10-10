import java.util.Scanner;

public class ShowLogicErrors {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);

        System.out.println("Tell me the Fahrenheit value to convert to Celsius");

        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Fahrenheit " + fahrenheit + " is Celsius " + celsius);

        input.close();
    }
}
