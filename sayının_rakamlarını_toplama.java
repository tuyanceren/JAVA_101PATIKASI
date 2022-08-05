import java.util.Scanner;

public class sayının_rakamlarını_toplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int sayı = input.nextInt();
        int basamak_sayısı=0;
        int toplam=0;

        while(sayı>0){
            toplam += sayı%10;
            sayı/=10;
            basamak_sayısı++;
        }
        System.out.println("Sayının rakamları toplamı : " + toplam);
    }
}
