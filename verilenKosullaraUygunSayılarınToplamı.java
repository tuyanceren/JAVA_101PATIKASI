import java.util.Scanner;

public class verilenKosullaraUygunSayılarınToplamı {
    public static void main(String[] args){
        int sayı ;
        int toplam=0 ;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz : ");
            sayı = input.nextInt();
            if(sayı%4==0 && sayı%2==0){
                toplam += sayı ;
            }
        }
        while(sayı%2==0);
            System.out.println("toplam : " + toplam);
    }
}
