
public class Account {
	private String accountNo;
	private int balance;
	private AccountType accountType;
	public Account(String aNo, AccountType aType) {
		this.accountType = aType;
		this.accountNo = aNo;
	}
}
