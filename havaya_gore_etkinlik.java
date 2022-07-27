import java.util.Scanner;

public class havaya_gore_etkinlik {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("hava sıcaklağını giriniz : ");
        int heat = input.nextInt();
        if (heat<5){
            System.out.println("kayak yapmaya gidebilirsiniz");
        }
        else if (heat<15 && heat>10) {
            System.out.println("sinemaya veya pikneğe gidebilirsiniz.");
        }
        else if (heat<15){
            System.out.println("sinemaya gidebilirsiniz.");
        }
        else if (heat<25){
            System.out.println("pikneğe gidebilirsiniz");
        }
        else{
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}
