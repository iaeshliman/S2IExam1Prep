package s2i.problem3;

public class Account
{
	// Instance Variables
	private static int count = 0;
	private int id;
	private String name;
	private float balance;
	
	// Constructor
	public Account(String name, float balance)
	{
		this.id = count++;
		this.name = name;
		this.balance = balance;
	}
	
	// Getters and Setters
	public int getID() { return this.id; }
	public String getName() { return this.name; }
	public float getBalance() { return this.balance; }
	public void setName(String name) { this.name = name; }
	public void setBalance(float balance) { this.balance = balance; }
	
	// toString
	public String toString()
	{
		return null;
	}
}
