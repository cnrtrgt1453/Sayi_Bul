import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner input = new Scanner(System.in);
        boolean varmı = false;

        System.out.println("Sayi giriniz..");
        int a = input.nextInt();

        for (int sayi : sayilar) {

            if (sayi == a) {
                varmı = true;
                break;
            }

        }

        if (varmı) {
            System.out.println("sayı mevcut");
        } else {
            System.out.println("sayı mevcut değil..");
        }

    }
}
