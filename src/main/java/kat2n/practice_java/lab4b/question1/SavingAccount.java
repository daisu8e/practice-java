package main.java.kat2n.practice_java.lab4b.question1;

public class SavingAccount {

  private double balance;
  private double interest;

  public SavingAccount(double balance, double interest) {
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
