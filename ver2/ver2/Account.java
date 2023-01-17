package ver2;

public class Account {
	public String toString() {
		String msg = "name="+ name + "balance=$" + balance;
		return msg;
	}

	// New Comment for balance
	// Instance variable, only available inside this class.
	private double balance;
	private String name;
	
	public Account(double balance) {
		this ("Unknown", balance);
	}
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	

	// A "getter" method that simply returns the balance.
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
// A method that increases the balance by amount
public void deposit(double amount) {
	if(amount>0) {
		balance += amount;
	}
	
}
	
	public String toString() {
		String msg = "balance=$" + balance;
		return msg;
	}

	// Informal test code
	public static void main(String[] args) {
		Account a1 = new Account(1000.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.withdraw(200.0);
		System.out.println("Balance=$" + a1.getBalance());
		System.out.println(a1.toString());
		System.out.println(a1);

	}


	public void withdraw(double d) {
		// TODO Auto-generated method stub
		
	}
	public void mergeAccount(Account a) {
		if(this.getName().equals(a.getName())) {
			this.balance += a.getBalance();
		}
	}

}
