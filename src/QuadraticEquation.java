
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int a,b,c;
       System.out.println("Define a");
       a= scanner.nextInt();
       System.out.println("Define b");
       b= scanner.nextInt();
       System.out.println("Define c");
       c= scanner.nextInt();
       int discriminant= (b*b)-(4*a*c);
       if (discriminant>0){
           System.out.println("There are 2 solutions");
           double sqrt1=((-b)+(Math.sqrt(discriminant)))/2*a;
           System.out.println("answer 1 is "+sqrt1);
           double sqrt2=((-b)-(Math.sqrt(discriminant)))/2*a;
           System.out.println("answer 2 is "+sqrt2);
       }else if (discriminant==0){
           System.out.println("There is 1 solution");
           double sqrt1=((-b)+(Math.sqrt(discriminant)))/2*a;
           System.out.println("answer 1 is "+sqrt1);
       }else{
           System.out.println("There is no solutions");
       }



    }
}
