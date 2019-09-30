package app;

/**
 * Student
 */
public class Student extends Person {

    private String classStatus;

    public Student(){
        classStatus = "";
    }

    public Student(String cs){
        cs = classStatus;
    }

    @Override
    public String toString() {
        return "Student [classStatus=" + classStatus + "]";
    }
    

}