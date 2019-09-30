package app;

/**
 * Faculty
 */
public class Faculty extends Employee {

    
        private String officeHours;
        private String rank;

        public Faculty(){
            officeHours = "";
            rank = "";
        }
        public Faculty(String officeHours, String rank) {
            this.officeHours = officeHours;
            this.rank = rank;
        }

    @Override
    public String toString() {
        return "Faculty [officeHours=" + officeHours + ", rank=" + rank + "]";
    }

        

    
}