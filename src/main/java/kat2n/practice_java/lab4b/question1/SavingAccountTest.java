package main.java.kat2n.practice_java.lab4b.question1;

public class SavingAccountTest {
  public static void main(String... args) {
    SavingAccount savingAccount = new SavingAccount(1000, 0.10);
    savingAccount.withdraw(240);
    savingAccount.deposit(400);

    System.out.printf("Current Balance: $%.1f\n", savingAccount.getBalance());
  }
}
