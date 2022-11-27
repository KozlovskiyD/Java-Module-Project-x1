import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calcut = new Calculator();
        System.out.println("На сколько человек разделить счёт?");
        int people;
        while (true) {
            Scanner sn = new Scanner(System.in);
            if (sn.hasNextInt()) {
                people = sn.nextInt();
                if (people <= 1) {
                    System.out.println("Введено некоректное количество человек.\nВедите новое значение:");
                } else {
                    break;
                }
            } else {
                System.out.println("Введено некоректное значение.\nВедите новое значени:");
            }
        }
        while (true) {
            Scanner sn = new Scanner(System.in);
            System.out.println("Ведите название товара:");
            String newTovar = sn.next();
            System.out.println("Введите стоимость товара:");
            calcut.zapTovar(newTovar);
            System.out.println("Товар успешно добавлен\nДобавить еще товар или завершить?");
            System.out.println("Для добавления ещё товара введите любое значени\nЕсли все товары добавлены введите 'завершить'");
            String endZapros = sn.next();
            if (endZapros.equalsIgnoreCase("завершить")) {
                break;}
        }
        System.out.println("Добавленые товары: " + "\n" + calcut.totalTovar);
        float sumNaPeople = calcut.summa / people;
        calcut.padeji(sumNaPeople);
        String format = "Общая стоимость: %.2f\nКаждый должен заплать: %.2f %s";
        System.out.println(String.format(format, calcut.summa, sumNaPeople, calcut.rub));
    }
    }

