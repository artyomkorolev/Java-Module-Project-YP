
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("На скольких человек необходимо разделить счёт?");
        int countPersons = scanner.nextInt();
        while(true){
            if(countPersons<1){
                System.out.println("Некорректное значение");
                System.out.println("На скольких человек необходимо разделить счёт?");
                countPersons = scanner.nextInt();
            }else if(countPersons==1){
                System.out.println("Нет смысла считать!");
                System.out.println("На скольких человек необходимо разделить счёт?");
                countPersons = scanner.nextInt();
            }else if(countPersons>1){

                break;
            }
        }
        Calculator calculator = new Calculator(countPersons);
        calculator.add();




    }
}