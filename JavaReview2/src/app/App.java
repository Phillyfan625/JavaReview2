package app;



public class App extends MyDate{
    public static void main(String[] args) {
       
        
        /*
        Write a test program that creates two MyDate objects (using new MyDate() and new MyDate(34355555133101L) ) and displays their year, month, and day. 
        The first two constructors will extract the year, month, and day from the elapsed time. 
        For example, if the elapsed time is 561555550000 milliseconds, the year is 1987, the month is 9, and the day is 18.
        */

        MyDate md = new MyDate();
        
        MyDate md2 = new MyDate();
        
        System.out.println(md.toString());
        System.out.println(md2.toString());


        /*
        Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
        */
        Person p1 = new Person();
        Student s1 = new Student();
        Employee e1 = new Employee();
        Faculty f1 = new Faculty();
        Staff st1 = new Staff();

        System.out.println(p1.toString());
        p1.setName("PJ");
        System.out.println(s1.toString());
        System.out.println(e1.toString());
        System.out.println(f1.toString());
        System.out.println(st1.toString());
        


    }
}