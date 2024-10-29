import java.util.*;
public class machine {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double  balance=2500;
        System.out.println("  WELCOME  ");
        System.out.print("Enter pin: ");
        int pin=sc.nextInt();
        if(pin==1234){
            System.out.println("1.Balance History");
            System.out.println("2.Deposit");
            System.out.println("3.Witthdraw");
            System.out.print("Select an option: ");
            int n=sc.nextInt();
            if(n==1){
                System.out.println("Available Balance : "+balance);
            }
            else if(n==2){
                System.out.print("Enter amount to deposit : ");
                double amount=sc.nextDouble();
                balance=balance+amount;
                System.out.println("Available balance : "+balance);
            }
            else if(n==3){
                System.out.print("Enter amount to withdraw : ");
                double amounts=sc.nextDouble();
                if(amounts>balance){
                    System.out.println("Insuficient balance");
                }
                else{
                balance=balance-amounts;
                System.out.println("Available balance : "+balance);
                }
            }
        }
        else{
            System.out.println("Please Enter correct pin");
        }
    }
}
