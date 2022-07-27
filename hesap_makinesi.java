import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("işlem seçiniz\n" + "1-toplama işlemi\n" + "2-çıkarma işlemi\n" +"3-çarpma işlemi\n" +"4-bölme işlemi\n" );
        System.out.print("işleminiz: ");
        int select = input.nextInt();

        System.out.print("1. sayıyı giriniz : ");
        double a1 = input.nextDouble();
        System.out.print("1. sayıyı giriniz : ");
        double a2 = input.nextDouble();
        switch(select){
            case 1:
                System.out.println(a1+a2);
                break;
            case 2:
                System.out.println(a1-a2);
                break;
            case 3:
                System.out.println(a1*a2);
                break;
            case 4:
                System.out.println(a1/a2);
                break;
            default:
                System.out.println("geçersiz işlem seçtiniz.");
                break;
        }
    }
}
