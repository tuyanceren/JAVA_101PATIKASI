import java.util.Scanner;

public class girilen_sayiya_kadar_olan_4_ve_5_in_kuvvetlerini_yazdir {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayı = input.nextInt();
        for (int i=1 ,j=1; i<=sayı ; i*=4,j*=5){
            System.out.println(i + "\n" + j);
        }

    }
}
