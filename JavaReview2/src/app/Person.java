package app;

/**
 * Person
 */
public class Person {

    private String name;
    private String address;
    private int number;
    private String email;

    public Person(String name, String address, int number, String email){
        this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person : address=" + address + ", email=" + email + ", name=" + name + ", number=" + number + "";
    }

    
   
}