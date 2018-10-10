import java.util.Scanner;

public class NetIncome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] hourlyRateList = {12.65, 13.65, 14.65, 15.65, 16.65};

        System.out.println("How many hours did you work?");
        int hours  = input.nextInt();

        System.out.println("Which hourly rate, 1 to 5?");
        int rate = input.nextInt();

        double gross = hours * hourlyRateList[rate - 1];
        double cpp = gross * 0.05;
        double ei = gross * 0.02;
        double net = gross - cpp - ei;

        System.out.println("Gross Income : " + gross);
        System.out.println("CPP : " + cpp);
        System.out.println("EI : " + ei);
        System.out.println("Net Income : " + net);

    }
}
