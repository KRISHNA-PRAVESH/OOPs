
class Employee{
    private String name;
    private String company;
    private int age;

    public Employee() {
    }

    public Employee(String name, String company, int age) {
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }
}
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(); //a variable of type Employee which will be stored in the heap memory
        //Every instance will have a hashcode in the heap memory
        //The constructor is invoked whenever new is used.
        //new ->invokes constructor and tells jvm to allocate memory for object in the heap, amount of memory allocated depends on the class
        //constructor initializes the class variables


        //psvm -> main is static because to call any mothod in java we need object, main is the startinig point of java program
        // static methods do not need objects to call them
        // Static variables are shared among all instances of the class
        //including static variables and static methods, are associated with the class itself and stored in a separate area of memory called the "Method Area" (also known as the "Class Area" or "Static Area"). The Method Area is a part of the JVM's runtime data area, distinct from the heap memory.

    }

}