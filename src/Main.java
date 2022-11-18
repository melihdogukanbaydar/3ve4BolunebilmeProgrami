import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,ortalama=0,toplam = 0,bolme=0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz : ");
        k = inp.nextInt();

        for ( int i = 1; i <= k; i++) {

            if (i % 12 == 0) {
                System.out.println(i);
                toplam += i;
                bolme++;
                ortalama = toplam/bolme;

            }
        }
        System.out.println("Ortalama : " + ortalama);
    }
}