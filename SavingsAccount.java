import java.util.Scanner;
public class SavingsAccount
{
  static double rate = 0.04;
  private double savingsBalance;
  SavingsAccount()
  {
    savingsBalance = 0;
  }
  void calculateMonthlyInterest()
  {
    savingsBalance = savingsBalance+((savingsBalance*rate)/12);
  }
  static void modifyInterestRate(double r)
  {
    rate = r;
  }
  public static void main(String args[])
  {
    SavingsAccount saver1 = new SavingsAccount();
    SavingsAccount saver2 = new SavingsAccount();
    saver1.savingsBalance = 2000.00;
    saver2.savingsBalance = 3000.00;
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println("First Month:- \nSaver 1 = "+String.format("%.2f",saver1.savingsBalance)+" \nSaver 2 = "+String.format("%.2f",saver2.savingsBalance));
    modifyInterestRate(0.05);
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println("Second Month:- \nSaver 1 = "+String.format("%.2f",saver1.savingsBalance)+" \nSaver 2 = "+String.format("%.2f",saver2.savingsBalance));
  }
}