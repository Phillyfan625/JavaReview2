package app;

/**
 * MyDate
 */
public class MyDate {

    private int year,month,day;

    public MyDate(){
        year = 2019;
        month = 9;
        day = 30;
    }

    public MyDate(int inf_year, int inf_month, int inf_day){
        inf_year = year;
        inf_month = month;
        inf_day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

     MyDate setDate(long elapsedTime){
      
         setDate(elapsedTime);
     }

    

    @Override
    public String toString() {
        return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
    
}