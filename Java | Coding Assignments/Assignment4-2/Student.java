/**
 * Griffin Murphy
 * CSC 104B
 */
public class Student extends Person{
   protected double GPA;
   protected String campusAddress;
   protected String lastName;
   protected String firstName;
   protected String SSNumber;
   public Student(String fn, String ln, String SSN, double gpa, String CA) {
       firstName = fn;
       lastName = ln;
       SSNumber = SSN;
        GPA = gpa;
        campusAddress = CA;
    }
    
    public void setGPA(double gpa) {
	    GPA = gpa;
	}
	public double getGPA() {
	    return GPA;
	}
	public void setcampusAddress(String CA) {
	    campusAddress = CA;
	}
	public String getcampusAddress() {
	    return campusAddress;
	}
	public void setlastName(String ln) {
	    lastName = ln;
	}
	public String getlastName() {
	    return lastName;
	}
	public void setfirstName(String fn) {
	    firstName = fn;
	}
	public String getfirstName() {
	    return firstName;
	}
	public void setSSNumber(String SSN) {
	    SSNumber = SSN;
	}
	public String getSSNumber() {
	    return SSNumber;
	}
	
	public String toString()
	{
	    return lastName + "\t" + firstName +
	           "\t" + SSNumber + "\t" + GPA + "\t" + campusAddress;
	}
	
	/**
	public String compareTo(Object o) { 
	    
	   }
	
	public boolean equals(Object o) {
        
    }
    */
}