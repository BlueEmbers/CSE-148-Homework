package p6;

public class Student extends Person
{
	private double gpa;
	
	public Student(String name, double gpa)
	{
		super(name);
		this.gpa = gpa;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	public Student shallowCopy()
	{
		return this;
	}

}
