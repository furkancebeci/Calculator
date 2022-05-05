import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Islem yapmak istediginiz birinci sayi = ");
        number1 = input.nextInt();
        System.out.print("Islem yapmak istediginiz ikinci sayi = ");
        number2 = input.nextInt();

        System.out.print("Yapacaginiz islemi seciniz:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\n");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuc = " + (number1 + number2));
                break;
            case 2:
                System.out.println("Sonuc = " + (number1 - number2));
                break;
            case 3:
                System.out.println("Sonuc = " + (number1 * number2));
                break;
            case 4:
                System.out.println("Sonuc = " + (number1 / number2));
                break;
            default:
                System.out.println("Hatali islem sectiniz");
        }
    }
}
