import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("küçük sayıyı giriniz: ");
        int n1=input.nextInt();
        System.out.print("büyük sayıyı giriniz: ");
        int n2=input.nextInt();
        int i=n1;
        int j=n2;
        int ebob;
        int ekok;
        while(i>=1) {
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
                System.out.println("ebob: " + ebob);
                break;
            }
            i--;
        }
        while(j<=(n1*n2)){
            if(j % n1==0 && j % n2==0){
                ekok = j;
                System.out.println("ekok" +ekok);
                break;
            }
            j++;
        }
    }
}
