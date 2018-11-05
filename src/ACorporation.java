public class ACorporation {

  public void pay(String employee, double basePay, int hoursWorked) {

    if (basePay < 8.00) {
      System.out.println("The base pay must be more than or equal to $8.00.");
      return;
    }

    if (hoursWorked > 60) {
      System.out.println("The hours worked must be less than or equal to 60.");
      return;
    }

    double result = 0.0;

    if (hoursWorked <= 40) {
      result = hoursWorked * basePay;
    } else {
      result = hoursWorked * basePay + (hoursWorked - 40) * (basePay * 1.5);
    }

    System.out.println(employee + " gets $" + result);

  }

}
