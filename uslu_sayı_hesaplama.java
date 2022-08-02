import java.util.Scanner;

public class uslu_sayı_hesaplama {
    public static void main(String[] args){
        int x;
        int a;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin : ");
        x = input.nextInt();
        System.out.print("Üssü girin : ");
        a = input.nextInt();

        for(int i =1 ; i<=a ; i++){
            total *= x;
        }
        System.out.println("sonuc : " + total);
    }
}
