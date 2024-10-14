package ie.atu.exceptions;

public class BankAccount{
    private double balance;

public BankAccount(double balance){
this.balance = balance;

}

public void withdraw(double amount) throws InsufficientFundsException {
if(amount > balance) {
	throw new InsufficientFundsException("Insufficient funds for withdrawl");
}
balance -= amount;
System.out.println("Withdrawl successful. Remaining balance: " + balance);
}

public static void main (String[]args){
BankAccount account = new BankAccount(100);

try{
account.withdraw(150);
}catch(InsufficientFundsException e){
System.out.println(e.getMessage());

}
}
}