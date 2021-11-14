import java.util.Scanner;
public class AcsendingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number");
        int thirdNumber = scanner.nextInt();
        if (firstNumber<=secondNumber&&firstNumber<thirdNumber) {
            System.out.println(firstNumber);
            if(secondNumber<=thirdNumber){
                System.out.println(secondNumber);
                System.out.println(thirdNumber);
            }else{
                System.out.println(thirdNumber);
                System.out.println(secondNumber);
            }
        } else if (secondNumber<firstNumber && secondNumber<thirdNumber){
            System.out.println(secondNumber);
            if (firstNumber<thirdNumber){
                System.out.println(firstNumber);
                System.out.println(thirdNumber);
            }else {
                System.out.println(thirdNumber);
                System.out.println(firstNumber);
            }
        }else{
            System.out.println(thirdNumber);
            if (firstNumber<secondNumber){
                System.out.println(firstNumber);
                System.out.println(secondNumber);
            }else {
                System.out.println(secondNumber);
                System.out.println(firstNumber);
            }
        }
    }
}
