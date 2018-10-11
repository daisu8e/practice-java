import java.util.Scanner;

public class NetIncome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] hourlyRateList = {12.65, 13.65, 14.65, 15.65, 16.65};

        System.out.println("How many hours did you work?");
        int hours  = input.nextInt();

        System.out.println("Which hourly rate, 1 to 5?");
        int rate = input.nextInt();

        double gross = 0;
        if (hours <= 80) {
            gross = hours * hourlyRateList[rate - 1];
        } else {
            gross = 80 * hourlyRateList[rate - 1] + (hours - 80) * hourlyRateList[rate - 1] * 1.5;
        }

        double cpp = gross * 0.05;
        double ei = gross * 0.02;
        double net = gross - cpp - ei;

        System.out.printf("Gross Income : $%.2f\n", gross);
        System.out.printf("CPP : $%.2f\n", cpp);
        System.out.printf("EI : $%.2f\n", ei);
        System.out.printf("Net Income : $%.2f\n", net);

    }
}
