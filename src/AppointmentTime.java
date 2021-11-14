import java.util.Scanner;
public class AppointmentTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the arrival day");
        int arrivalDay = scanner.nextInt();
        if (arrivalDay > 7 ^ arrivalDay < 1) {
            System.out.println("the chosen day isn't legal");
        } else if (arrivalDay == 6 ^ arrivalDay == 7) {
            System.out.println("the office is closed on weekend");
        } else {
            System.out.println("enter the earliest hour for arrival");
            int earlyArrivalHour = scanner.nextInt();
            System.out.println("enter the latest hour for arrival");
            int lateArrivalHour = scanner.nextInt();
            if ((earlyArrivalHour < 0 ^ earlyArrivalHour > 23) && (lateArrivalHour < 0 ^ lateArrivalHour > 23)) {
                System.out.println("the chosen hour isn't legal");
            } else if (earlyArrivalHour > lateArrivalHour) {
                System.out.println(" early arrival hour is grater then late arrival hour");
            } else {
                switch (arrivalDay) {
                    case 1: case 2: case 4: case 5:
                        if ((earlyArrivalHour >= 9 && earlyArrivalHour <=17) && (lateArrivalHour >= 9 && lateArrivalHour <=17)) {
                            System.out.println("O.K you can come");
                        } else {
                            System.out.println("the office is open between 9-17");
                        }
                        break;
                    case 3:
                        if ((earlyArrivalHour >= 8 && earlyArrivalHour <=12) && (lateArrivalHour >= 8 && lateArrivalHour <=12)){
                            System.out.println("O.K you can come");
                        } else {
                            System.out.println("the office is open between 9-17");
                        }
                        break;
                }
            }
        }
    }
}
        
      

