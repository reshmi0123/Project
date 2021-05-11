import java.util.*;
import java.util.Scanner;
public class BankAccount
{
    String acc_name; 
    int acc_no;
    int balance;

    BankAccount(int a,String n,int b)
    {
        acc_name=n;
        acc_no=a;
        balance=b;
    }
    public static void display(BankAccount a,BankAccount b)
    {
        System.out.println("For The 1st Person :-");
        System.out.println("Name:- "+a.acc_name);
        System.out.println("Account Number:- "+a.acc_no);
        System.out.println("Balance :- "+a.balance);
        System.out.println("--------------------------");
        System.out.println("For The 2nd Person :-");
        System.out.println("Name:- "+b.acc_name);
        System.out.println("Account Number:- "+b.acc_no);
        System.out.println("Balance :- "+b.balance);
    } 
    public static void check(BankAccount a, BankAccount b)
    {
        if(a.balance>b.balance){
            System.out.println(a.acc_name+" Has more Balance in his/her Account");
        }
        else{
            System.out.println(b.acc_name+" Has more Balance in his/her Account");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Account No. , Name & Balance respectively :");
        int acc_no=sc.nextInt();
        String acc_name=sc.next();
        int balance=sc.nextInt();
        BankAccount a=new BankAccount(acc_no,acc_name,balance);

        System.out.println("Enter the Account No. , Name & Balance respectively :");
        int acc_no1=sc.nextInt();
        String acc_name1=sc.next();
        int balance1=sc.nextInt();
        BankAccount b=new BankAccount(acc_no1,acc_name1,balance1);
        display(a,b);
        check(a,b);
    }
}
