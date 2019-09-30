package app;

/**
 * Staff
 */
public class Staff extends Employee {

    private String title;
    
    public Staff(){
        title = "";

    }

    public Staff(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff [title=" + title + "]";
    }
    
    
}