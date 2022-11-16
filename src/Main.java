public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("  Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        //Задача 2
        System.out.println("  Задача 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
        //Задача 3
        System.out.println("  Задача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println("Четные числа " + i);
        }
        //Задача 4
        System.out.println("  Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Искомые числа " + i);
        }
        //Часть 2. Задача 1
        System.out.println("  Часть 2. Задача 1 ");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        //Часть 2. Задача 2
        System.out.println("  Часть 2. Задача 2 ");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        //Часть 2. Задача 3
        System.out.println("  Часть 2. Задача 3 ");
        System.out.println(1);
        for (int i = 2; i <= 512; i *= 2) {
            System.out.println(i);
        }
        //Часть 3. Задача 1
        System.out.println("  Часть 3. Задача 1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
             total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        //Часть 3. Задача 2
        System.out.println("  Часть 3. Задача 2");
        int deposit = 0;
        for (int i = 1; i <= 12; i++) {
            deposit = deposit + deposit / 100;
            deposit = deposit + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей.");
        }







    }
}