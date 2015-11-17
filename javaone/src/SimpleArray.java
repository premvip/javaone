
import java.util.ArrayList;



public class SimpleArray {
	  public static void main(String[] a) {
	    ArrayList<Employee> emps = new ArrayList<Employee>();
	    emps.add(new Employee("Kagitala", "Venkata"));
	    emps.add(new Employee("Sun", "Jason"));
	    emps.add(new Employee("Resende", "Paulo"));
	    emps.add(new Employee("Jayaram", "Hundi"));
	    emps.add(new Employee("Chandran", "Rachana"));
	    emps.add(new Employee("Bobba", "Bharat"));
	    emps.add(new Employee("Vippulancha", "Prem"));
	    emps.add(new Employee("Ponnuswami", "Ram"));
	    emps.add(new Employee("Chava", "Manoj"));
	    emps.add(new Employee("Sterling", "Debbie"));
	    emps.add(new Employee("Lisette","Lisett"));
	    System.out.println("Team : \n");
	    for(int i=0;i<emps.size();i++)
	    {
	    	System.out.println(emps.get(i).getFirstName()+"  "+emps.get(i).getLastName()+ "\n" + emps.get(i).getAddress());
	    }
	  }
	}

	class Address {
		private String address;
		Address(String s){address=s;}
		public String getAddress(){ return address;}
	}

	class Employee {
	  private String lastName;

	  private String firstName;

	  private Double salary;

	  public Address address;

	  public Employee(String lastName, String firstName) {
	    this.lastName = lastName;
	    this.firstName = firstName;
	    this.address = new Address("1100 Merrill Lynch Dr, Pennington, NJ");

	  }

	  public String getLastName() {
	    return this.lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public String getFirstName() {
	    return this.firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public double getSalary() {
	    return this.salary;
	  }

	  public void setSalary(double salary) {
	    this.salary = salary;
	  }
	  public String getAddress(){ return address.getAddress();}
	}

	   
	    