import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private double sum;
    private int guests;
    private ArrayList<Good> goods;

    public Calculator() {
        guests = getGuests();
        goods = new ArrayList<Good>();
    }

    private int getGuests() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (true) {
            System.out.print("На сколько человек делим счёт?:");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > 1) {
                    return input;
                } else System.out.println("Значение должно быть больше 1");
            } else System.out.println("Значение некорректно!!!");
            String buf = scanner.nextLine();
        }
    }

    public void addGoods() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите наименование товара:");
        String name = scanner.nextLine();
        double price = -1.00;
        while (true) {
            System.out.print("Введите цену:");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                if (Double.compare(price, 0.00) >= 0) break;
            }
            System.out.println("Значение некорректно!!!");
            String buf = scanner.nextLine();
        }

        goods.add(new Good(name, price));
        sum += price;
    }

    public void print() {
        System.out.println("Добавленные товары:");
        for (Good good : goods) {
            good.print();
        }
        System.out.println(String.format("ИТОГО: %.2f %s", sum, Format.rublFormat(sum)));
        System.out.println("Всего человек : " + guests);
        System.out.println(String.format("На каждого: %.2f %s", sum / guests, Format.rublFormat(sum / guests)));
    }
}
