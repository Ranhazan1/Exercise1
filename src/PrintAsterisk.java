import java.util.Scanner;

public class PrintAsterisk {
    public static void main(String[] args) {
        int value = insertValue();
        printAsterisk(value);
    }

    public static int insertValue() {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        do {
            System.out.println("enter a number between 5-20");
            number = scanner.nextInt();
        } while (number < 5 || number > 20);
        return number;
    }

    public static void printAsterisk(int value) {
        for (int i=1;i<=value;i++){
            for (int a=0;a<i;a++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
