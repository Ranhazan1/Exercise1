import java.util.Scanner;
public class FactoryEmployees {
    public static int salaryOffEmployee(int workerType, int workHours, int dailyDestination) {
        int salary = 0;
        if (workerType == 0) {
            salary = (workHours * 50) + (dailyDestination * 250);
        } else if (workerType == 1) {
            salary = (workHours * 200) + (dailyDestination * 250);
        }
        return salary;
    }
    public static void main(String[] args) {
        int i=1;
        while (i!=9) {
            Scanner scanner = new Scanner(System.in);
            int typeOffEmployee=5;
            while (typeOffEmployee!=0&&typeOffEmployee!=1){
            System.out.println("enter the type of employee (0 for junior,1 for senior)");
            typeOffEmployee = scanner.nextInt();}
            System.out.println("enter the hours number of work");
            int workHours = scanner.nextInt();
            System.out.println("enter the number of daily destination");
            int dailyDestination = scanner.nextInt();
            System.out.println("the salary is: " + salaryOffEmployee(typeOffEmployee, workHours, dailyDestination));
            System.out.println("to enter another employee pres any key to stop press 9");
            i= scanner.nextInt();
        }
    }
}