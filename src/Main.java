//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++)
            System.out.printf("%-4d ", +i);
        System.out.println();

        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i--)
            System.out.printf("%-4d ", +i);
        System.out.println();

        System.out.println("Задача №3");
        for (int i = 0; i < 17; i += 2)
            System.out.printf("%-4d ", +i);
        System.out.println();

        System.out.println("Задача №4 ");
        for (int i = 10; i >= -10; i--)
            System.out.println(i);

        System.out.println("Задача №5");
        for (int i = 1904; i < 2096; i += 4)
            System.out.println(i);

        System.out.println("Задача №6");
        for (int i = 7; i <= 98; i += 7)
            System.out.printf("%-4d ", +i);
        System.out.println();

        System.out.println("Задача №7");
        for (int i = 1; i <= 512; i *= 2)
            System.out.printf("%-4d ", +i);
        System.out.println();

        System.out.println("Задача №8");
        int savings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задача №9");
        int savings2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + savings2/100;
            total2 = total2 + savings2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total2 + " рублей.");
        }

        System.out.println("Задача №10");
        for (int i = 1; i <= 10; i ++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }

    }
}