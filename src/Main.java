public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.printf("Результат: \n %d > %d \n %d > %d", result, Math.abs(result), Math.abs(result), result);
        System.out.println(" ");
    }
    public static void task2() {
        System.out.println("Задание 2");
        int a = 5;
        int b = 7;

        a = b + a; // a = 5 + 7 = 12
        b = a - b; // b = 12 - 7 = 5
        a = a - b; // a = 12 - 5 = 7
        System.out.printf("Значение переменной a = %d, значение переменной b = %d", a,b);
        System.out.println(" ");

    }
    public static void task3() {
        System.out.println("Задание 3");
        int a = 735;
        int b = (a % 100) / 10; //применяем функцию остаток от деления, и делим полученное число на 10.

        System.out.printf( "Переменная b = %d", b);
        System.out.println(" ");

        }


}