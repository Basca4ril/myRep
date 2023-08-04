
package vut;

/**
 Store the staff number, name and salary of an employee
 @author Mrs S Ribeiro (20000)
 */
public class Employee
{
    private String name;
    private double salary;

    /**
    Create a default employee object with:
    0 as the staff number, "None" as the name and 1000 as the salary
    */
    public Employee()
    {
        this( "None", 1000.00);
    }

    /**
     Create a new employee with the given staff number, name and salary
     @param name The new name
     @param salary The new salary
     */
    public Employee(String name, double salary)
    {
        setName(name);
        setSalary(salary);
    }

       /**
     Change the name of the object
     @param name The new name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    //No javadoc comment for this method - it is not a public method
    //private methods are for the own class' use. Salaries will be changed
    //using the increaseSalary method
    private void setSalary(double salary)
    {
        this.salary = salary;
    }

   
    /**
     Return the name of the employee
     @return the name of the employee
     */
    public String getName()
    {
        return name;
    }

    /**
     Return the salary of the employee
     @return the salary of the employee
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     Increase the salary by the given percentage
     @param percentage The percentage to increase the salary with
     */
    public void increaseSalary(double percentage)
    {
        salary = salary + (salary * percentage / 100);
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[name=" + name+ ", salary=" + salary + "]";
    }
}
