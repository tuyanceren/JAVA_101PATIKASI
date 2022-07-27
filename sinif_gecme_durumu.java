import java.util.Scanner;

public class sinif_gecme_durumu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuzu girin :");
        int mat  = input.nextInt();
        System.out.print("fizik notunuzu girin :");
        int fizik  = input.nextInt();
        System.out.print("kimya notunuzu girin :");
        int kimya  = input.nextInt();
        System.out.print("türkçe notunuzu girin :");
        int turkce  = input.nextInt();
        System.out.print("müzik notunuzu girin :");
        int muzik  = input.nextInt();

        int total = 0;
        total = (0<=mat && 100>=mat) ? total+= mat : total;
        total = (0<=fizik && 100>=fizik) ? total+= fizik : total;
        total = (0<=kimya && 100>=kimya) ? total+= kimya : total;
        total = (0<=turkce && 100>=turkce) ? total+= turkce : total;
        total = (0<=muzik && 100>=muzik) ? total+= muzik : total;
        double ort= total/5;
        System.out.println("Ortalamanız : " + ort);
        if (ort<55){
            System.out.println("kaldınız...");
        }
        else{
            System.out.println("geçtiniz...");
        }
    }
}
