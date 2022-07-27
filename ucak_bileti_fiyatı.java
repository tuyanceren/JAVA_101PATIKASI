import java.util.Scanner;

public class ucak_bileti_fiyatı {
    public static void main(String[] args){
        double km_ucreti = 0.10, yol_ucreti = 0.0 , indirim = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("HOŞGELDİNİZ...\n" +
                "******************************************************************\n" +
                "-Yolcu 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.\n" +
                "-Yolcu 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.\n" +
                "-Yolcu 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.\n" +
                "-Yolcu \"Yolculuk Tipini\" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.\n" +
                "******************************************************************");
        System.out.print("Mesafeyi km türünden giriniz : ");
        int km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        int yön = input.nextInt();

        yol_ucreti = km * km_ucreti;

        if (yas<12){
            yol_ucreti -= yol_ucreti * 0.5;
        }
        else if (yas>=12 && yas<=24){
            yol_ucreti -= yol_ucreti * 0.1;
        }
        else if (yas>65){
            yol_ucreti -= yol_ucreti * 0.3;
        }

        switch (yön){
            case 1:
                System.out.println("Toplam tutar : " + yol_ucreti);
                break;
            case 2:
                yol_ucreti -= yol_ucreti * 0.2;
                System.out.println("Toplam tutar : " + 2 * yol_ucreti);
        }
    }
}
