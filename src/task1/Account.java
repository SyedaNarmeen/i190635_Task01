/*
 * Syeda Narmeen
 * 19I-0635
 * Task1
 */
package task1;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Account
{
	 private String customerName;
	    private String address;
	    private String dateCreated;
	    private int contact;
	    private int accountId;
	    private int accountType;
	    private double bal;
	    private int fees;
	    
	    Account()
	    {
	        customerName = "/0";
	        address = "/0";
	        contact = 0;
	        dateCreated="today";
	        accountId = 0;
	        accountType = 0;
	        bal = 0;
	        fees=-2;
	    }
	    
	    Scanner inp1 = new Scanner(System.in);
	    
	    void openNewAccount() {
	        System.out.print("Enter your name: ");
	        customerName = inp1.next();
	        System.out.print("Enter your address: ");
	        address = inp1.next();
	        System.out.print("Enter your contact number: ");
	        contact = inp1.nextInt();
	        System.out.print("Enter your account id: ");
	        accountId = inp1.nextInt();
	        
	        do
	        {
	        System.out.print("Enter the type of account you want: 1 for checkings and 2 for savings : ");
	        accountType = inp1.nextInt();
	        if((accountType!=1 && accountType!=2))
	        System.out.print("You entered an invalid type.");
	        }while(accountType>2 || accountType<1);
	        
	        System.out.print("Enter your balance : ");
	        bal = inp1.nextDouble();
	    }
	    
	    void printStatement()
	    {
	        System.out.print("\nThe name of the account holder is: "+customerName);
	        System.out.print("\nThe address of the account holder is: "+address);
	        System.out.print("\nThe contact numebr of the account holder is: "+contact);
	        System.out.print("\nThe account id is: "+accountId);
	        System.out.print("\nThe date and time of transaction is: ");
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	        LocalDateTime now = LocalDateTime.now();
	        System.out.println(dtf.format(now));  
	        System.out.print("The balance in the account is: "+bal);
	    }
	    
	    void checkBalance()
	    {
	        System.out.print("The name of the account holder is: "+customerName);
	        System.out.print("The balance in teh account is: "+bal);
	    }
	    
	    void calculateZakat()
	    {
	        if(bal >= 20000)
	        System.out.print("The zakaat for this account is: "+ (bal * 2.5)/100);
	        else
	        System.out.print("Zakat is not applicable on this account");
	    }
	    
	    void calculateInterest(int interest)
	    {
	    	if(accountType==1)
	    		System.out.print("You can not get interest for checkings accounts");
	    	else
	    		System.out.print("Your interest is: "+bal*interest/100);
	    }
	    
	    void makeWithdrawal(){
	    	
	        double n;
	        System.out.print("Enter the amount you want to withdraw");
	        n=inp1.nextDouble();
	        if(accountType==1)
	        {
	            if(n>bal)
	            System.out.print("You can not withdraw that amount");
	            else
	            bal-=n;
	        }
	        else
	        {
	            if(n>bal)
	            {
	                if((n-bal)<=5000)
	                bal-=n;
	                else
	                System.out.print("You can not withdraw taht amount");
	            }
	            else
	            bal-=n;
	        }
	        
	    }
	    
	    void makeDeposit(){
	        double n;
	        System.out.print("Enter the amount you want to deposit");
	        n=inp1.nextDouble();
	        bal+=n;
	    }
	    
	    String getCustomerName() {
	        return customerName;
	    }
	    
	    String getAddress() {
	        return address;
	    }
	    
	    String getCreatedDate() {
	        return dateCreated;
	    }
	    
	    int getContact()
	    {
	    	return contact;
	    }
	    
	    int getAccountId() {
	        return accountId;
	    }
	    
	    int getAccountType() {
	        return accountType;
	    }
	    
	    double getBalance() {
	    	return bal;
	    }
	    
	    int getFees() {
	    	return fees;
	    }
	    
	    void setName(String a)
	    {
	    	customerName=a;
	    }
	    
	    void setAddress(String a)
	    {
	    	address=a;
	    }
	    
	    void setContact(int a)
	    {
	    	contact=a;
	    }
	    
	    void setId(int a)
	    {
	    	accountId=a;
	    }
	    
	    void setType(int a)
	    {
	    	accountType=a;
	    }
	    
	    void setBal(double a)
	    {
	    	bal=a;
	    }
	    
	    void addFees()
	    {
	    	fees++;
	    }
	    
	    


}
