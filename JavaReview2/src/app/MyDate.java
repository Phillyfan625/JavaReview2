package app;
import java.util.Date;
/**
 * MyDate
 */
public class MyDate {

    private int year,month,day;

    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    public MyDate(){
        year = 0;
        month = 0;
        day = 0;
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

    public void setDate(long elapsedTime) {
		long totalSeconds = elapsedTime / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		long totalDays = totalHours / 24;
		totalDays++;
		
		
		}

    @Override
    public String toString() {
        return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
    }
    
}