import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int positiveNumber = positiveNUmber();
        for (int i = 0; i < positiveNumber; i++) {
            if (checkPrimeNumber(i) == true) {
                System.out.println(i);
            }
        }
    }
    public static boolean moduloZeroBetweenNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int firstNumber= scanner.nextInt();
        System.out.println("enter the second number");
        int secondNumber= scanner.nextInt();
        int difference=firstNumber%secondNumber;
        boolean answer=false;
        if (difference==0){
            answer=true;
        }else {
            answer=false;
        }return  answer;
    }
    public static boolean checkPrimeNumber(int number){
        int primeNumber= number;
        boolean answer=false;
        for (int i=2;i<primeNumber;i++){
            if (primeNumber%i==0) {
                answer = false;
                return answer;
            }else{
                answer=true;
            }
        }return answer;
    }
    public static int positiveNUmber(){
        Scanner scanner=new Scanner(System.in);
        int number=0;
        do {
            System.out.println("enter a positive number");
            number= scanner.nextInt();
        }while (number<1);
        return number;
    }
}
