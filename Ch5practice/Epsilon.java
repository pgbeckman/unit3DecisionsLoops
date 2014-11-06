import java.util.Scanner;

public class Epsilon{
   public static void main(String[] args){
       final double EPSILON = 1e-10;
       
       Scanner s = new Scanner(System.in);
       System.out.println("Number: ");
       double value = s.nextDouble();
       
       String magnitude = "";
       
       if(Math.abs(value)<1.0){
           magnitude = "small";
        }
       else if(Math.abs(value)>1000000.0){
           magnitude = "large";
        }
        
       if (Math.abs(value)<EPSILON){
           System.out.println("Is zero");
        }
       else if (value>0) {
           System.out.println("Is "+magnitude+" positive");
        }
       else {
           System.out.println("Is "+magnitude+" negative");
       }
  }
}
