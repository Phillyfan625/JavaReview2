package app;

import java.util.Date;

public class App {
    public static void main(String[] args) {
       
        /*
        Write a test program that creates two MyDate objects (using new MyDate() and new MyDate(34355555133101L) ) and displays their year, month, and day. 
        The first two constructors will extract the year, month, and day from the elapsed time. 
        For example, if the elapsed time is 561555550000 milliseconds, the year is 1987, the month is 9, and the day is 18.
        */

         MyDate md = new MyDate(1987, 9, 18);
         MyDate md2 = new MyDate(34355555133101L);
        
         System.out.println(md.toString());
         System.out.println(md2.toString());

        /*
        Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
        */
        Person p1 = new Person("Bob", "Main Street", 102, "bob@gmail.com");
        Student s1 = new Student("Ander", "Liv", 103, "b@b.com", Student.FRESHMAN);
        Employee e1 = new Employee("Selena", "Gomez", 103, "c@c.com", "Music Room", 1000, new MyDate(2013, 12, 31));
        // Faculty f1 = new Faculty("test","test",1,"ted","e");
        Staff st1 = new Staff("Don", "Mooney", 106, "don@me.com", "LugCom", 3000, new MyDate(2013, 11, 11), "Teacher");

        System.out.println(p1);
        System.out.println(s1);
        System.out.println(e1);
        // System.out.println(f1);
        System.out.println(st1);
        
    }
}