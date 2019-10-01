package app;

/**
 * Employee
 */
public class Employee {
      
        private String office;
        private double salary;
        private MyDate dateHired;

        public Employee(String name, String address, int number, String email,String office, double salary, MyDate dateHired) {
        super();
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;    
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: dateHired=" + dateHired + ", office=" + office + ", salary=" + salary + "";
    }
    
}