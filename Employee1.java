package AssignmentSession3;

public class Employee1
{   
	
	// Assignment 3_3
	
    public String empName;
    public int empSalary;
    public String address;

    public Employee1()
    {
        this("Zair");
    }

    public Employee1(String name)
    {
    	this(name, 50000);
    }
    public Employee1(String name, int sal)
    {
    	this(name, sal, "Alpharetta");
    }
    public Employee1(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.address=addr;
    }

    void display() {
    	System.out.println("Employee Name: "+empName);
    	System.out.println("Employee Salary: "+empSalary);
    	System.out.println("Employee Address: "+address);
    }
    public static void main(String[] args)
    {
        Employee1 obj = new Employee1();
        obj.display();
    }
}
