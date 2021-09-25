/*
 * Syeda Narmeen
 * 19I-0635
 * Task1
 */
//
package task1;
import java.util.Scanner;



public class Main
{
	public static void main(String[] args) {
	    int a=0,b,c,x,y,z=0;
	    Account arr[] = new Account[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Account();
        }
        System.out.println("\nWelcome to Bank of Now");
        do
        {
		System.out.println("\n\nPress 1 to Open a New Account");
		System.out.println("Press 2 to Close an Account");
		System.out.println("Press 3 to Login to an Account");
	    System.out.println("Press 4 to Display all Account Details");
        System.out.println("Press 5 to exit menu");
        Scanner inp= new Scanner(System.in);
        x=inp.nextInt();
        
        if (x==1) 
        {
            for (int i = 0; i < arr.length; i++) 
            {
                if(arr[i].getCustomerName()=="/0")
                {
                    arr[i].openNewAccount();
                    break;
                }
            }
  
        } 
        else if (x==2) 
        {
        	int s=0,f=0;
        	System.out.print("Enter your account id to delete account: ");
            y=inp.nextInt();
            for (int i = 0; i < arr.length; i++) 
               {
                   if(arr[i].getAccountId()==y)
                   {
                	   s=i;
                	   f=1;
                   }
               }
            if(f==1)
            {
            for (int i = s; i < (arr.length-s); i++) 
            {
                	   arr[i].setName(arr[i+1].getCustomerName());
                	   arr[i].setAddress(arr[i+1].getAddress());
                	   arr[i].setContact(arr[i+1].getContact());
                	   arr[i].setId(arr[i+1].getAccountId());
                	   arr[i].setType(arr[i+1].getAccountType());
                	   arr[i].setBal(arr[i+1].getBalance());
                   
            }
            }
            else
            	System.out.print("Invlaid id");
           
        } 
        else if (x==3) 
        {
         System.out.print("Enter your account id to login: ");
         y=inp.nextInt();
         for (int i = 0; i < arr.length; i++) 
            {
                if(arr[i].getAccountId()==y)
                {
                    System.out.print("You are logged in. \nWhat transaction do you wish to proceed with? ");
                    z=1;
                    a=i;
                    break;
                }
            }
            
         if(z!=1)
         {
             System.out.print("Your id is invalid.");
         }
         else
         {
            do
            {
            System.out.println("\n\nPress 1 to make a deposit");
		    System.out.println("Press 2 to make a withdrawal");
		    System.out.println("Press 3 to check your balance");
		    System.out.println("Press 4 to print a statement");
	        System.out.println("Press 5 to transfer an amount");
            System.out.println("Press 6 to calculate your zakaat");
            System.out.println("Press 7 to display all deductions");
            System.out.println("Press 8 to specify the Interest Rate for your savings account and calculate your interest");
            System.out.println("Press 9 to log out");
            b=inp.nextInt();
            if (b==1)
            {
            	if(arr[a].getAccountType()==1)
            		arr[a].addFees();
                arr[a].makeDeposit();
            }
            else if(b==2)
            {
                arr[a].makeWithdrawal();
            }
            else if (b==3)
            {
                arr[a].checkBalance();
            }
            else if (b==4)
            {
                arr[a].printStatement();
            }
            else if (b==5)
            {
            	int p=0,s=0,f=0,g=0;
            	System.out.print("Enter your account id: ");
                y=inp.nextInt();
                for (int i = 0; i < arr.length; i++) 
                   {
                       if(arr[i].getAccountId()==y)
                       {
                    	   s=i;
                    	   f=1;
                       }
                   }
                if(f==1)
                {
                	System.out.print("Enter the account id you want to transfer to: ");
                    y=inp.nextInt();
                    for (int i = 0; i < arr.length; i++) 
                       {
                           if(arr[i].getAccountId()==y)
                           {
                        	   p=i;
                        	   g=1;
                           }
                       }
                    if(g==1) {
                    	System.out.print("Enter the amount you want to transfer: ");
                        y=inp.nextInt();
                        if(arr[s].getBalance()>=y)
                        {
                        	arr[s].setBal(arr[s].getBalance()-y);
                        	arr[p].setBal(arr[s].getBalance()+y);
                        	
                        }
                        else
                        	System.out.print("You don't have this much money to transfer");
                    	
                    }
                    else
                    	System.out.print("Invlaid id");
                }
                    else
                    	System.out.print("Invlaid id");
                    	
            }
            else if (b==6)
            {
                arr[a].calculateZakat();
            }
            else if (b==7)
            {
                if(arr[a].getFees()>0)
                	System.out.println("Your deductions are: "+(arr[a].getFees()*10));
            }
            else if(b==8)
            {
            	System.out.println("Specify the interest rate you want");
            	c=inp.nextInt();
            	arr[a].calculateInterest(c);
            }
            else if (b==9)
            {
               System.out.println("Logging out");
            }
            else
            System.out.println("You entered an invalid option");
            }while(b<9);
         }
        } 
        
        else if (x==4) 
        {
        	int q=0;
        	 for (int i = 0; i < arr.length; i++) 
        	 {
        		 if(arr[i].getCustomerName()!="/0")
        			 q++;
        	 }
        		 for (int i = 0; i < q; i++) 
        		 {
        		 System.out.println("\nInformation of user # "+(i+1));
                 arr[i].printStatement();
        		 }
        } 
        else if (x==5) 
        {
        	System.out.println("We hope you had a pleasant experience with us. \nGoodbye :)");
        } 
        else 
        {
         System.out.println("You entered an invalid input.");
        }
        z=0;
        }while (x<5 && x>0);
        

	}
}