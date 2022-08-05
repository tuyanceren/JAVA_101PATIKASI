import java.util.Scanner;

public class harmonik_sayılar {
    public static void main(String[] args){

        int sayı;
        double toplam=0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        sayı = input.nextInt();

        for(double i=1 ; i<= sayı ; i++){
            toplam += 1/i;
        }
        System.out.println("harmonik sayısı : " + toplam);
    }
}
