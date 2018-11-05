public class TestInterface {
  public static void main(String... args) {
    Bank scotia = new Scotia();
    Bank tdBank = new TDBank();

    System.out.println("Scotia Bank's ROI : " + scotia.rateOfInterest());
    System.out.println("TD Bank's ROI : " + tdBank.rateOfInterest());
  }
}
