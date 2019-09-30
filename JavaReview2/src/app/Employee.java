package app;

/**
 * Employee
 */
public class Employee {
      
        private String office;
        private int salary;
        //private String dateHired;

        public Employee(){
            office = "";
            salary=0;
        }
        public Employee(String inf_Office, int inf_Salary){
            office = inf_Office;
            salary = inf_Salary;
        }
}