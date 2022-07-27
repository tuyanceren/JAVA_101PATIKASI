import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kaç km yol gidiceksiniz : ");
        int km = input.nextInt();
        double km_tutarı = 2.20;
        double acılıs_ücreti = 10;
        double odenicek_tutar = acılıs_ücreti +( km * km_tutarı ) ;
        System.out.print("ödenicek tutar : ");
        System.out.println(odenicek_tutar < 20 ? 20 : odenicek_tutar);
    }
}
