import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1000)+1;
        int user1 = 0;
        int user2 = 0;
        int guess1=0;
        int guess2=0;
        while ((guess1!=randomNumber)||(guess2!=randomNumber)){
            System.out.println("player 1:guess a number");
            guess1= scanner.nextInt();
            user1=++user1;
            if (guess1==randomNumber) {
                System.out.println("player 1 win after " + user1 + " tries");
                break;
            }else if (guess1<randomNumber) {
                System.out.println("the number is grater");
            }else {
                System.out.println("the number is smaller");
            }
            System.out.println("player 2:guess a number");
            guess2= scanner.nextInt();
            user2=++user2;
            if (guess2==randomNumber) {
                System.out.println("player 2 win after " + user2 + " tries");
                break;
            }else if (guess2<randomNumber){
                System.out.println("the number is grater");
            }else {
                System.out.println("the number is smaller");
            }
        }
        }
    }
