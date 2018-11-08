public class Lab4bQuestion1SavingAccount {

  private double balance;
  private double interest;

  public Lab4bQuestion1SavingAccount(double balance, double interest) {
    this.balance = balance;
    this.interest = interest;
  }

  public void deposit(double money) {
    this.balance += money;
  }

  public void withdraw(double money) {
    this.balance -= money;
  }

  public void addInterest(double interest) {
    this.interest += interest;
  }

  public double getBalance() {
    return this.balance + this.balance * this.interest;
  }
}
