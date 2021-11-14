import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the firs number");
        int firNumber = scanner.nextInt();
        System.out.println("enter the difference between numbers");
        int difference = scanner.nextInt();
        int membersNumber =0;
        while (membersNumber < 1) {
            System.out.println("enter the number of members");
            membersNumber = scanner.nextInt();
        }
        arithmeticProgression(firNumber, difference, membersNumber);
    }
    public static void arithmeticProgression(int firsNumber, int difference, int membersNumber) {
        for (int i = 0; i < membersNumber; i++) {
            System.out.println(firsNumber);
            firsNumber=firsNumber+difference;
        }
    }
}
