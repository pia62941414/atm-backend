import java.util.Scanner;	
public class Main
{
	
private static Scanner in; 
private static float balance = 0; 
private static int anotherTransaction;

public static void main(String args[])
{
in = new Scanner(System.in);
	 
transaction();
}
	
private static void transaction()
{
	
int choice; 

System.out.println("Please select an option"); 
System.out.println("1.Withdraw");
System.out.println("2.Deposit");
System.out.println("3.Balance");
System.out.println("4.Fixed Deposit");
System.out.println("5.Mobile Recharge");
System.out.println("6.Insurance Premium");
System.out.println("7.Transfer Cash");
System.out.println("Choose operation you want to perform:");
	
choice = in.nextInt();
	
switch(choice)
{

case 1:                                                           //withdrawal

float amount; 
System.out.println("Please enter amount to withdraw: "); 
amount = in.nextFloat();
if(amount > balance || amount == 0)
{
System.out.println("You have insufficient funds\n\n"); 
anotherTransaction(); 
}
 else 
{
balance = balance - amount; 
System.out.println("You have withdrawn "+amount+" and your new balance is "+balance+"\n");
anotherTransaction(); 
}
break; 
	
case 2:                                                             //depositing money
	 
float deposit; 
System.out.println("Please enter amount you would wish to deposit: "); 
deposit = in.nextFloat(); 
balance = deposit + balance;
System.out.println("You have deposited "+deposit+" new balance is "+balance+"\n");
anotherTransaction();
break; 
	
case 3:                                                              //Display balance

System.out.println("Your balance is "+balance+"\n");
anotherTransaction(); 
break;
	
case 4:                                                              //opening an FD

int acc_no;
char FDtype;
int period,prin_amt;
char ch,ch1;
System.out.println("Enter account number:");
acc_no=in.nextInt();
System.out.println("Enter Fixed Deposit Type:");
FDtype=in.next().charAt(0);
System.out.println("Enter end date when FD matures:");
period=in.nextInt();
System.out.println("Enter amt for which FD is opened for:");
prin_amt=in.nextInt();
System.out.println("Add Nominee's Details");
System.out.println("Enter Nominee name:");
char name=in.next().charAt(0);
System.out.println("Enter relationship with nominee:");
char rela=in.next().charAt(0);
System.out.println("Is nominee Minor?\n\n Press y for Yes \n n for No:");
ch=in.next().charAt(0);
if(ch==y)
{
System.out.println("Enter Nominee's Date of birth:");
System.out.println("Enter Date:");
int date=in.nextInt();
System.out.println("Enter Month:");
int month=in.nextInt();
System.out.println("Enter Year:");
int year=in.nextInt();
System.out.println("Enter Guardian's Name:");
char name2=in.next().charAt(0);
System.out.println("Enter relationship:");
char rela2=in.next().charAt(0);
}
System.out.println("Do you want to Review information??" \n\n Press 1 for Yes or any other key for no");
if(ch1==1)
{
System.out.println("From Account  -  "+acc_no);
System.out.println("FD type  -   "+FDtype);
System.out.println("Placement period  -  "+period);
System.out.println("Principal Amount  -  "+prin_amt);
System.out.println("Nominee Name  -  "+name1);
System.out.println("Relationship  -  "+rela);
System.out.println("is the nominee minor?  -  "+ch);
}
if(prin_amt>balance||prin_amt==0)
{
System.out.println("Insufficient Balance!!!");
anotherTransaction();  
}
else
{
System.out.println("Congratulations your FD is created!!");
balance=balance-prin_amt();
System.out.println("Your new balance is:"+balance);
anotherTransaction();
}
break;

case 5:                                                                   //mobile recharge

int MobNo,amt;
System.out.println("Enter your 10 digit Mobile Number:");
MobNo=in.nextInt();
System.out.println("Enter Amount,the recharge is to be of:");
amt=in.nextInt();
if(amt>balance||amt==0)
{
System.out.println("Insufficient Funds!!\n\n");
anotherTransaction();
}
else
{
balance=balance-amt;
System.out.println("Your mobile has been recharged");
System.out.println("Your new balance is:"+balance);
anotherTransaction();
}
break;

case 6:                                                         //pay premium insurance

System.out.println("Enter Insurer:");
char Ins=in.next().charAt(0);
System.out.println("Enter Mobile Number:");
int mob_no=in.nextInt();
System.out.println("Enter Premium amount:");
int amt2=in.nextInt();
if (amt2>=balance||amt2==0)
{
System.out.println("Insufficient balance");
anotherTransaction();
}
else
{
balance=balance-amt2;
System.out.println("Congratulations,your premium insurance has been payed");
System.out.println("Your new  balance is:"+balance);
anotherTransaction();
}
break;

case 7:                                                  //transferring funds

int amt3;
System.out.println("Enter amount to be transferred:");
amt3=in.nextInt();
if(amt3>=balance||amt3>4000)
{
System.out.println("Request cannot be processed");
anotherTransaction();
}
else
{
System.out.println("Enter Benificiaries account number:");
int acc_no1=in.nextInt();
balance=balance-amt3;
System.out.println("Funds are transferred");
System.out.println("Your new balance is:"+balance);
anotherTransaction();
}
break;

default:
System.out.println("Invalid choice!!!");
anotherTransaction();  
}
	
private static void anotherTransaction()
System.out.println("Do you want another transaction?\n\n Press 1 for another transaction\n AND 2 To          exit");
anotherTransaction = in.nextInt();
if(anotherTransaction == 1)
{
transaction(); // call transaction method
} 
else if(anotherTransaction == 2)
{
System.out.println ("Thanks for choosing us. Good Bye!");
} 
else 
{
System.out.println("Invalid choice\n\n");
anotherTransaction();
}
}	
}
