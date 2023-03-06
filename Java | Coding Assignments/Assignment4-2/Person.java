/**
 * Griffin Murphy
 * CSC 104B
 */
public abstract class Person implements Compareable {
protected String lastName;
protected String firstName;
protected String SSNumber;
    public Person() {
        lastName = "first";
        firstName = "last";
        SSNumber = "ssn";
    }
    
    public Person(String ln, String fn, String SSN) {
        lastName = ln;
        firstName = fn;
        SSNumber = SSN;
    }
    public void setlastName(String ln)
	{
	    lastName = ln;
	}
	public String getlastName()
	{
	    return lastName;
	}
	public void setfirstName(String fn)
	{
	    firstName = fn;
	}
	public String getfirstName()
	{
	    return firstName;
	}
	public void setSSNumber(String SSN)
	{
	    SSNumber = SSN;
	}
	public String getSSNumber()
	{
	    return SSNumber;
	}
	
	public String compareTo(Object o) { 
	    
	   }
	
	public boolean equals(Object o) {
        
    }
}
