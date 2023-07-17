package abstraction;

abstract class Employee{

    private String name;
    private int employeeId;
    public Employee(String name,int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract void calculateSalary();
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("abstraction.Employee Id:"+employeeId);
    }

}

class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(String name,int employeeId,double monthlySalary){
        super(name,employeeId);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public void calculateSalary(){
        System.out.println("Calculating salary for full-time employee...");
        // Additional logic specific to full-time employee salary calculation
        double annualSalary = monthlySalary * 12;
        System.out.println("Annual Salary: " + annualSalary);
    }

}

class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name,int employeeId,double hourlyRate,int hoursWorked){
        super(name,employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for part-time employee...");
        // Additional logic specific to part-time employee salary calculation
        double weeklySalary = hourlyRate * hoursWorked;
        double monthlySalary = weeklySalary * 4;
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        //abstract class contains abstract and non abstract methods
        //object cannot be created for an abstract class
        //representing complex systems, objects, or ideas in a simplified and generalized manner

        //Use abstract class to provide a common template for related classes Ex: Vehicle -> car , bike
        //use interface to provide template for un related classes Ex: Flyable -> Airplane, Bird.

        // In an abstract class, some methods can be implemented, while others are left abstract, meaning that they have no implementation and must be overridden by concrete subclasses
         Employee fullTimeEmployee = new FullTimeEmployee("John",1001,5000.0);
         Employee partTimeEmployee = new PartTimeEmployee("Jake",2001,20.0,30);

         fullTimeEmployee.displayInfo();
         fullTimeEmployee.calculateSalary();

         System.out.println("-----------------------------");

         partTimeEmployee.displayInfo();
         partTimeEmployee.calculateSalary();
    }
}
