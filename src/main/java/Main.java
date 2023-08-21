import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            calculator.addGoods();
            System.out.print("Продолжить ввод товара? \n" +
                    "Если нет введите \"Завершить\"");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("завершить")) break;
        }
        ;
        calculator.print();
    }
}