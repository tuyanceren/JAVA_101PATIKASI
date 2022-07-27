import java.util.Scanner;

public class sayı_yazdırma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int sayı = input.nextInt();
        int toplam = 0;

        for(int i = 1 ; i <= sayı ; i++){
            if ( i%3 == 0 && i%4 == 0){
                toplam += i;
            }
        }
        System.out.println("girdiğiniz sayıya kadar olan sayılardan 3'e ve 4'e bölünebilen sayıların toplamı : " + toplam);
    }
}
