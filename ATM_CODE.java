import java.util.*;
//sum of two numbers taking input from user
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to ATM");
        System.out.println("Enter PIN : ");
        int pin = sc.nextInt();
        int balance = 10000;
        int deposite = 0;
        int withdrawl = 0;
        if (pin == 1234){
             System.out.println("Select any one option");
             System.out.println("Check your balance --> Press 1");
              System.out.println("Deposit money --> Press 2");
               System.out.println("Withdrawl money --> Press 3");
               System.out.println("Press valid option : ");
               int opt = sc.nextInt();
               if(opt == 1){
                  System.out.println("Balance remaining is : "+ balance);
               }
               else if(opt  == 2){
                    System.out.println("Enter Amount : ");
                    int dep = sc.nextInt();
                    balance = balance + dep;
                         System.out.println("Balance is  : " + balance) ;
               }
        
        else{
             System.out.println("Enter Amount  : ");
             int with = sc.nextInt();
             balance = balance - with;
              System.out.println("Remaining balance is : " + (balance));
              
        }
      }
        else{  
              
             System.out.println("Incorrect PIN!!!!!");
        }
    }
}
