package app;

/**
 * Student
 */
public class Student extends Person {

    private String classStatus;
	static final String FRESHMAN = "Freshman";
	static final String SOPHOMORE = "Sophomore";
	static final String JUNIOR = "Junior";
    static final String SENIOR = "Senior";
    
    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }

    public Student(String name, String address, int number, String email, String classStatus){
        super(name, address, number, email);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student [classStatus=" + classStatus + "]";
    }
    
    

}