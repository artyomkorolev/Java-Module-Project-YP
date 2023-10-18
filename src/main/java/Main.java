
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("На скольких человек необходимо разделить счёт?");
        while (!scanner.hasNextInt()) {
            System.out.println("Некорректный ввод количества человек. Повторите ввод:");
            scanner.next();
        }
        int countPersons = scanner.nextInt();

        while(true){
            if(countPersons<1){
                System.out.println("Некорректное значение");
                System.out.println("На скольких человек необходимо разделить счёт?");
                while (!scanner.hasNextInt()) {
                    System.out.println("Некорректный ввод количества человек. Повторите ввод:");
                    scanner.next();
                }
                countPersons = scanner.nextInt();
            }else if(countPersons==1){
                System.out.println("Нет смысла считать!");
                System.out.println("На скольких человек необходимо разделить счёт?");
                while (!scanner.hasNextInt()) {
                    System.out.println("Некорректный ввод количества человек. Повторите ввод:");
                    scanner.next();
                }
                countPersons = scanner.nextInt();
            }else {

                break;
            }
        }
        Calculator calculator = new Calculator(countPersons);
        calculator.add();




    }
}