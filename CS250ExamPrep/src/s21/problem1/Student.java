package s21.problem1;

public class Student extends Person
{
	// Instance Variables
	private float grade;
	
	// Constructor
	public Student(String name, int age, float grade)
	{
		super(name,age);
		this.grade = grade;
	}
	
	// Getters and Setters
	public float getGrade() { return this.grade; }
	public void setGrade(float grade) { this.grade = grade; }
	
	// toString
	public String toString()
	{
		return null;
	}
}
