package banking;
import java.util.Scanner;

class account{
        double accno;
        String name;
        double bal;
        
        account(double balance,String nameofaccholder,double accountno){
            bal=balance;
            name=nameofaccholder;
            accno=accountno;
        }
        void deposit(double balance){
            bal+=balance;
        }
        void withdraw(double balance){
                while(bal-balance>=0)
                {
                    bal-=balance;
                }
        }
        void display()
        {
           System.out.println("Balance is"+bal);
        }
}
public class Banking {

    public static void main(String[] args) {
            Scanner inp=new Scanner(System.in);
            int choice;
            int count=0;
            while(true)
            {
                System.out.println("Enter your choice");
                System.out.println("1.Create an account");
                System.out.println("2.Deposit to an account");
                System.out.println("3.Withdraw to an accont");
                System.out.println("4.Transfers");
                System.out.println("5.Total cash in bank");
                System.out.println("6.Richest account holder in this bank");
                choice=inp.nextInt();
                switch(choice){
             
                    case 1: System.out.println("Enter your name,initial deposit amount");
                     String name=inp.next();  
                     double bal = inp.nextDouble();
                     count++;
                     account newacc=new account(bal,name,count);
                {
                    account[] Account = null;
                    Account[count]=newacc;
                }
                     count++;
                     break;
                    case 2: System.out.println("Enter your accno");
                    double accno=inp.nextDouble();
                
                    }
      
                     
            
            
            
            
                }
        }
    
    }