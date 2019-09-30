package app;



public class App extends MyDate {
    public static void main(String[] args) {
        
        MyDate md = new MyDate();
        md.setDay(25);
        md.setMonth(6);
        md.setYear(1999);
        MyDate md2 = new MyDate();
        
        System.out.println(md.toString());
        System.out.println(md2.toString());
    }
}