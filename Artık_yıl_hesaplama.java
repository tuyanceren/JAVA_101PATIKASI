import java.util.Scanner;

public class Artık_yıl_hesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("yıl giriniz : ");
        int yıl = input.nextInt();
        if (yıl%4==0){
            if (yıl%100 == 0){
                if (yıl%400 == 0){
                    System.out.println("artık yıl");
                }
                else{
                    System.out.println("artık yıl değil");
                }
            }
            else {
                System.out.println("artık yıl");
            }
        }
        else{
            System.out.println("artık yıl değil");
        }
    }
}
