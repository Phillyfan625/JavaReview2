package app;

/**
 * Person
 */
public class Person {

    private String name;
    private String address;
    private int number;
    private String email;

    public Person(){
        name = "default";
        address = "default";
        number = 0;
        email = "default";
    }

    public Person(String inf_Name, String inf_Address, int n, String e){
        inf_Name = name;
        inf_Address = address;
        n = number;
        e = email;
    }

    public class Student{

        private String classStatus;

        public Student(){
            classStatus = "";
        }

        public Student(String cs){
            cs = classStatus;
        }

    }

    public class Employee{
        
        private String office;
        private int salary;
        //private String dateHired;
   
        public class Faculty{
            private String officeHours;
            private String rank;

        }

        public class Staff{
            private String title;

        }
    }
   
}