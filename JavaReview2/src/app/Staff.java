package app;

/**
 * Staff
 */
public class Staff extends Employee {

    private String title;
    

    public Staff(String name, String address, int number,String emailAddress, String office, double salary, MyDate hired, String title) {
		super(name, address, number, emailAddress, office, salary, hired);
		this.title = title;
	}
    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    @Override
    public String toString() {
        return "Staff : title=" + title + "";
    }
    
    
}