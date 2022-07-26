import java.util.Scanner;

public class hipotenüs_bulma {
    public static void main(String[] args){
        Scanner kenarlar = new Scanner(System.in);
        System.out.print("kenar giriniz : ");
        int a = kenarlar.nextInt();
        System.out.print("kenar giriniz : ");
        int b = kenarlar.nextInt();
        double hipotenüs  = Math.sqrt((a*a) + (b*b));
        System.out.println("hiponetüs : " + hipotenüs);
    }
}
