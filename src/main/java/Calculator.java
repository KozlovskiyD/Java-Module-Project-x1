import java.util.Scanner;

public class Calculator {
    String nameTovar;
    float cena;
    String totalTovar = "";
    float summa = 0;
    void  zapTovar(String nameTovar) {
        totalTovar = totalTovar + nameTovar + "\n";
        while (true) {
            Scanner sn = new Scanner(System.in);
            if (sn.hasNextFloat()) {
                cena = sn.nextFloat();
                if (cena <= 0) {
                    System.out.println("Ведена некоректная стоимость товара\nВедите новое значение");
                } else {
                    break;
                }
            } else {
                System.out.println("Введено некоректное значени соимости\nВведите новое значение");
            }
        }
        summa = summa + cena;
    }
    String rub;
    float sumNaTovar;
    int ost;
    void padeji (float sumNaTovar) {
        ost = (int) (Math.floor(sumNaTovar));
        ost = ost % 100;
        if (ost > 9 && ost < 21) {
            rub = "рублей";
        } else {
            ost = ost % 10;
            switch (ost) {
                case 1:
                    rub = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    rub = "рубля";
                    break;
                default:
                    rub = "рублей";
            }
        }
    }
}
