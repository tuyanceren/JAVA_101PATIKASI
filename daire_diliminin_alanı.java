import java.util.Scanner;

public class daire_diliminin_alanı {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        System.out.print("yarıçap değerini giriniz : ");
        double r = input.nextDouble();

        System.out.print("açı değerini giriniz : ");
        int a = input.nextInt();

        double pi = 3.14 ;
        double dilim_alanı = (pi * (r*r) * a)/360;

        System.out.println("daire diliminin alanı :" + dilim_alanı);
    }
}
//Formül : (𝜋 * (r*r) * 𝛼) / 360