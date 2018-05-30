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

    account() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            int count=0,i;
            account[] a=new account[10];
            double accno;
            while(true)
            {
                System.out.println("Enter your choice");
                System.out.println("1.Create an account");
                System.out.println("2.Deposit to an account");
                System.out.println("3.Withdraw to an account");
                System.out.println("4.Transfers");
                System.out.println("5.Total cash in bank");
                System.out.println("6.Richest account holder in this bank");
                System.out.println("7.BALANCE CHECK");
                choice=inp.nextInt();
                switch(choice){
             
                    case 1: System.out.println("Enter your name,initial deposit amount");
                     String name=inp.next();  
                     double bal = inp.nextDouble();
                     count++;
                     a[count]=new account(bal,name,count);                
                     break;
                    case 2: System.out.println("Enter your accno");
                    accno=inp.nextDouble();
                    for(i=1;i<=count;i++)
                    {
                        if(accno==a[i].accno)
                        {
                            System.out.println("Enter deposit amount");
                            double balance=inp.nextDouble();
                            a[i].deposit(balance);
                        }
                        else
                        {
                            System.out.println("Invalid entries");
                        }
                            
                    }
                    break;
                    case 3:System.out.println("Enter your accno");
                    accno=inp.nextDouble();
                    for(i=1;i<=count;i++)
                    {
                        if(accno==a[i].accno)
                        {
                            System.out.println("Enter withdrawal amount");
                            double balance=inp.nextDouble();
                            a[i].withdraw(balance);
                        }
                        else
                        {
                            System.out.println("Invalid entries");
                        }
                            
                    }
                    break;
                    case 4:System.out.println("Enter your accno");
                    double accno1=inp.nextDouble();
                    for(i=1;i<=count;i++)
                    {
                        if(accno1==a[i].accno)
                        {
                            int temp=i;
                            System.out.println("Enter transfer acc no:");
                            accno=inp.nextDouble();
                            for(i=1;i<=count;i++)
                            {
                                if((accno==a[i].accno) && (accno!=accno1))
                                {
                                    System.out.println("Enter transfer amount");
                                    double balance=inp.nextDouble();
                                    a[i].deposit(balance);
                                    a[temp].withdraw(balance);   
                                }
                                else
                                    System.out.println("Invalid attempt");
                            }
                        }   
                    }
                    break;
                    case 5:System.out.println("Total amount bank is::");
                    double sum=0;
                    for(i=1;i<=count;i++)
                    {
                        sum+=a[i].bal;
                    }
                    System.out.println(sum);
                    break;
                    case 6: System.out.println("Richest person is");
                    account rich = new account();
                    rich.bal=0;
                    rich.name="unknown";
                    for(i=1;i<=count;i++)
                    {
                        if(a[i].bal>rich.bal)
                            rich=a[count];
                    }
                    System.out.println(rich.name);
                    break;
                    case 7: System.out.println("Enter acc no:");
                    accno=inp.nextDouble();
                    for(i=0;i<=count;i++)
                    {
                        if(accno==a[i].accno)
                        {
                            a[i].display();
                        }
                    }
                    default: System.out.println("Invalid entry");
                    
            }
        }
    }
}
    