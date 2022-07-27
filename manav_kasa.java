import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args){
        Double Armut = 2.14 , Elma = 3.67 , Domates = 1.11 , Muz = 0.95 , Patlıcan = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print(" Armut kaç kilo ? " );
        double A = input.nextDouble();
        System.out.print(" Elma kaç kilo ? " );
        double E = input.nextDouble();
        System.out.print(" Domates kaç kilo ? " );
        double D = input.nextDouble();
        System.out.print(" Muz kaç kilo ? " );
        double M = input.nextDouble();
        System.out.print(" Patlıcan kaç kilo ? " );
        double P = input.nextDouble();

        double total = (Armut * A) + (Elma * E) + (Domates * D) + (Muz * M) + (Patlıcan * P) ;
        System.out.print("tutar : " + total);
    }
}
