import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 0;
        int sayi2 = 0;
        String islem;
        float sonuc = 0;
        System.out.println("Lütfen birinci sayıyı giriniz: ");
        Scanner scanner1 = new Scanner(System.in);
        sayi1 = scanner1.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        Scanner scanner2 = new Scanner(System.in);
        sayi2 = scanner2.nextInt();
        System.out.println("Lütfen yapılacak işlemi giriniz: ");
        Scanner scanner3 = new Scanner(System.in);
        islem = scanner3.nextLine();
        switch (islem) {
            case "*":
                System.out.println("Sonuç = " + (sayi1 * sayi2));
                break;
            case "+":
                System.out.println("Sonuç = " + (sayi1 + sayi2));
                break;
            case "-":
                System.out.println("Sonuç = " + (sayi1 - sayi2));
                break;
            case "/":
                if (sayi2 == 0) {
                    System.out.println("Geçersiz bir değer girdiniz lütfen sayı 2 yi 0 dan farklı bir değer giriniz");
                    break;
                } else {
                    sonuc = (float) sayi2 / sayi2;
                    System.out.println("SONUÇ: " + sonuc);
                    break;
                }
                default:
                System.out.println("Geçersiz işlem operatörü!");
                break;
        }

    }
}