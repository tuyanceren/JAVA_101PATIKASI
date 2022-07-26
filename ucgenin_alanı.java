import java.util.Scanner;

public class ucgenin_alanı {
    public static void main(String[] args){
        Scanner kenarlar = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        int a = kenarlar.nextInt();
        System.out.print("2. kenarı giriniz : ");
        int b = kenarlar.nextInt();
        System.out.print("3. kenarı giriniz : ");
        int c = kenarlar.nextInt();
        int cevre = (a+b+c)/2;
        double alan = Math.sqrt(cevre * (cevre-a) * (cevre-b) * (cevre-c));
        System.out.println("üçgeninizin alanı : " + alan);
    }
}