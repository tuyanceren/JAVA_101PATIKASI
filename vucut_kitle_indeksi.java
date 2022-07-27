import java.util.Scanner;

public class vucut_kitle_indeksi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuz : ");
        double kilo = input.nextDouble();
        System.out.print("Boyunuz 'örnek (1,62)' : ");
        double boy = input.nextDouble();

        double vdk = kilo /(boy * boy);
        System.out.println("Vücut kitle indeksiniz : " + vdk);

    }
}
    //Formül : Kilo (kg) / Boy(m) * Boy(m)