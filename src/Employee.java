public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}


/*public  class  Salary extends Employee{
    private double salary;
    Salary(String name, String address, int number, double salary){
        super(name, address, number);
        this.salary = salary;
    }*/
/* File name : Salary.java */
class Salary extends Employee {
    private double salary;   // Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }



}


/* File name : AbstractDemo.java */
class AbstractDemo {

    public static void main(String [] args) {
        /* Following is not allowed and would raise error */
        Salary s = new Salary("George W.", "Houston, TX", 43, 5326.88);
        System.out.println("\n Call mailCheck using Employee reference--");
        s.mailCheck();
        Employee e = new Salary("MMM W.", "Houston, TS Boston", 23, 5006.88);
        e.mailCheck();
    }
}