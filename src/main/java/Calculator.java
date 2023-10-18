import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public int count;
    private static final Scanner scanner = new Scanner(System.in);
    public Calculator(int count) {
        this.count = count;
    }
    static ArrayList<Product> products = new ArrayList<>();
    float sum =0;
    void add() {

        while (true) {
            if(products.isEmpty()){
                System.out.println("Введите название товара ");
                String name = scanner.next();
                System.out.println("Введите цену товара: ");
                while (!scanner.hasNextFloat()) {
                    System.out.println("Некорректный ввод для цены. Введите цену товара:");
                    scanner.next();
                }
                float price = scanner.nextFloat();
                if (price < 0) {
                    System.out.println("Стоимость товара не может быть отрицательной. Повторите ввод товара.");
                    continue;
                }
                sum =sum+price;
                Product product = new Product(name, price);
                products.add(product);
                System.out.println("Товар добавлен!");
            }else {
                System.out.println("Добавьте еще товар  или закончите добавление, написав - Завершить :");
                String name = scanner.next();
                if(!name.equalsIgnoreCase("завершить")) {
                    System.out.println("Введите цену товара: ");
                    while (!scanner.hasNextFloat() ) {
                        System.out.println("Некорректный ввод для цены. Введите цену товара:");
                        scanner.next();
                    }
                    float price = scanner.nextFloat();
                    if (price < 0) {
                        System.out.println("Стоимость товара не может быть отрицательной. Повторите ввод товара.");
                        continue;
                    }
                    sum =sum+price;
                    Product product = new Product(name, price);
                    products.add(product);
                    System.out.println("Товар добавлен!");
                }else {
                    print();
                    break;
                }
            }}
    }
    void print(){

        System.out.println("Добавленные товары:");
        for (Product product : Calculator.products) {
            System.out.println(product.name +" - " +Formatter.twoPoints(product.price)+ " "  + Formatter.ending(product.price));

        }
        System.out.println("Сумма всех товаров - "+ Formatter.twoPoints(sum) +" " + Formatter.ending(sum));
        System.out.println("Каждый человек должен заплатить - "+ Formatter.twoPoints(sum/count) +" " + Formatter.ending(sum/count));
    }

}

