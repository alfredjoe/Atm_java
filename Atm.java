import java.util.Scanner;
class Atm
{
public static void main(String[] args)
{
int choice,pin=1234,enteredPin,amount,balance=10000,newPin;
Scanner sc=new Scanner(System.in);
System.out.println("Welcome to Automated teller machine");
System.out.println("Enter the choice 1,2,3,4");
System.out.println("choice 1:Withdraw money");
System.out.println("Choice 2:credit money");
System.out.println("Choice 3:Check balance");
System.out.println("Choice 4:change pin");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the pin");
enteredPin=sc.nextInt();
if(enteredPin==pin)
{
System.out.println("Enter the amount to withdraw");
amount=sc.nextInt();
	if(amount<balance){
	System.out.println("withdrawing..................");
try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
	balance=balance-amount;
	System.out.println("withdraw successfull amount = "+amount+" Rs");
	System.out.println("Balance amount = "+balance+" Rs");
	System.out.println("Thank you for using atm");
	}
	else{
	System.out.println("No sufficient balance please retry");
	System.out.println("Balance amount = "+balance+" Rs");
	System.out.println("Thank you for using atm");
	}
}
else{
System.out.println("Enter valid pin number and try again");
System.out.println("Thank you for using atm");
}
break;
case 2:
System.out.println("Enter the pin");
enteredPin=sc.nextInt();
if(enteredPin==pin)
{
System.out.println("Enter the amount to credit");
amount=sc.nextInt();
System.out.println("Current balance = "+balance);
System.out.println("crediting..................");
try {
                     Thread.sleep(5000);
       } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
balance=balance+amount;
System.out.println("credit successfull amount = "+amount+" Rs");
System.out.println("Balance amount = "+balance+" Rs");
System.out.println("Thank you for using atm");
}
else{
System.out.println("Enter valid pin number and try again");
System.out.println("Thank you for using atm");
}
break;
case 3:
System.out.println("Enter the pin");
enteredPin=sc.nextInt();
if(enteredPin==pin)
{
System.out.println("Balance amount = "+balance+" Rs");
System.out.println("Thank you for using atm");
}
else{
System.out.println("Enter valid pin number and try again");
System.out.println("Thank you for using atm");
}
break;
case 4:
System.out.println("Enter the pin");
enteredPin=sc.nextInt();
if(enteredPin==pin)
{
System.out.println("Enter the New pin");
newPin=sc.nextInt();
pin=newPin;
System.out.println("Balance amount = "+balance+" Rs");
System.out.println("Thank you for using atm");
}
else{
System.out.println("Enter valid pin number and try again");
System.out.println("Thank you for using atm");
}
break;
default:
                System.out.println("Invalid choice. Please select a valid option.");
}
}
}







