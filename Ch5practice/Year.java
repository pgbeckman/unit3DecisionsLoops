import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Year:");
        Year y = new Year(s.nextInt());
        System.out.println(y.isLeapYear());
    }
    private int year;
    public Year(int yearIn){
        year = yearIn;
    }
    public boolean isLeapYear() {
        return (year%4==0 && year%100!=0 || year%400==0) ;
    }
}
