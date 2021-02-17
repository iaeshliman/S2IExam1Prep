package s21.problem1;

public class Teacher extends Person
{
	// Instance Variables
	private float salary;
	
	// Constructor
	public Teacher(String name, int age, float salary)
	{
		super(name,age);
		this.salary = salary;
	}
	
	// Getters and Setters
	public float getSalary() { return this.salary; }
	public void setSalary(float salary) { this.salary = salary; }
	
	// toString 
	public String toString()
	{
		return null;
	}
}
