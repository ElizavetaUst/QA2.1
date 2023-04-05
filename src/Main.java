public class Main {
    public static void main(String[] args) {

        int x = 100; //начальный баланс
        int y = 1100; //сумма пополнения
        int b = 100; //стоимость одного бонусного рубля

        if (y > 1000) {
            System.out.println(y / b + x + y);
        }

        if (y < 1000) {
            System.out.println(x + y);
        }
    }

}