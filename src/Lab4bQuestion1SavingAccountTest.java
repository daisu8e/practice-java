public class Lab4bQuestion1SavingAccountTest {
  public static void main(String... args) {
    Lab4bQuestion1SavingAccount savingAccount = new Lab4bQuestion1SavingAccount(1000, 0.10);
    savingAccount.withdraw(240);
    savingAccount.deposit(400);

    System.out.printf("Current Balance: $%.1f\n", savingAccount.getBalance());
  }
}
