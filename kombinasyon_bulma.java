import java.util.Scanner;

public class kombinasyon_bulma {
    public static int faktoriyel (int a){
        int total = 1;
        for (int i = 1; i <= a; i++) {
        total = total * i ;
        }
        return total;
    }

    public static void main(String[] args){
        int n ;
        int r ;
        int c ;

        Scanner input = new Scanner(System.in);
        System.out.println("kombinasyonu hesaplanıcak sayıları giriniz... ");
        n =input.nextInt();
        r =input.nextInt();

        c =faktoriyel(n)/(faktoriyel(r)* faktoriyel((n-r)));
        System.out.println("kombinasyon : " + c);
    }
}
