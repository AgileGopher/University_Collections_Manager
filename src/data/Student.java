package data;

public class Student extends Person {

	// student fields
	private double gpa;
	
	
	
	// symbolic constants
	private static double DEFAULT_GPA;
	private static double MAX_GPA;
	
	
	
	// initializer
	{
		DEFAULT_GPA = 0.0;
		MAX_GPA     = 4.0;
		
	}
	
	
	
	// consructors
	public Student() {
		super();
	}
	
	public Student(int id, String name, String course, double gpa) {
		super(id, name, course);
		validateGPA(gpa);
		this.gpa = gpa;
	}

	
	
	// validators
	private static void validateGPA(double gpa) {
		if(gpa < DEFAULT_GPA || gpa > MAX_GPA){
			throw new IllegalArgumentException("Error, Invalid gpa: " + gpa);
		}
	}
	
	
	
	// getters and setters
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		validateGPA(gpa);
		this.gpa = gpa;
	}
	
	
	
	// toString
	@Override
	public String toString() {
		return "Student [gpa=" + gpa + "]";
	}
	
	
}
