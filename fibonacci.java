import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        ArrayList mylist = new ArrayList<>();
        mylist.add(0);
        mylist.add(1);

        int a=0;
        int b=1;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.println("please write the number you want to see fibonacci series: ");
        int number =input.nextInt();
        while (number>1) {
            c= a+b;
            mylist.add(c);
            a=b;
            b=c;
            number--;
        }
        System.out.println(mylist);
    }
}
