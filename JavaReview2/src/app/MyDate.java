package app;
import java.util.Date;

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

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    

    //  MyDate setDate(long elapsedTime){
      
    //      setDate(elapsedTime);
    //  }

    

    @Override
    public String toString() {
        return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
    
}