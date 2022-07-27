import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class burc_bulma {
    public static void main(String[] args){
/*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart*/
        Scanner input = new Scanner(System.in);
        String burc = null;
        Boolean isError = false;
        System.out.print("Doğduğunuz ayı giriniz : ");
        int mount = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        int day = input.nextInt();

        if (mount==1){
            if(1<=day && day<=31){
                if (day<=21){
                    burc = "Oğlak";
                }
                else {
                    burc = "Kova";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==2){
            if(1<=day && day<=28){
                if (day<=19){
                    burc = "Kova";
                }
                else {
                    burc = "Balık";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==3){
            if(1<=day && day<=31){
                if (day<=20){
                    burc = "Balık";
                }
                else {
                    burc = "Koç";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==4){
            if(1<=day && day<=30){
                if (day<=20){
                    burc = "Koç";
                }
                else {
                    burc = "Boğa";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==5){
            if(1<=day && day<=31){
                if (day<=21){
                    burc = "Boğa";
                }
                else {
                    burc = "İkizler";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==6){
            if(1<=day && day<=30){
                if (day<=22){
                    burc = "İkizler";
                }
                else {
                    burc = "Yengeç";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==7){
            if(1<=day && day<=31){
                if (day<=22){
                    burc = "Yengeç";
                }
                else {
                    burc = "Aslan";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==8){
            if(1<=day && day<=31){
                if (day<=22){
                    burc = "Aslan";
                }
                else {
                    burc = "Başak";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==9){
            if(1<=day && day<=30){
                if (day<=22){
                    burc = "Başak";
                }
                else {
                    burc = "Terazi";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==10){
            if(1<=day && day<=31){
                if (day<=22){
                    burc = "Terazi";
                }
                else {
                    burc = "Akrep";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==11){
            if(1<=day && day<=30){
                if (day<=21){
                    burc = "Akrep";
                }
                else {
                    burc = "Yay";
                }
            }
            else{
                isError = true;
            }
        }
        else if (mount==12){
            if(1<=day && day<=31){
                if (day<=21){
                    burc = "Yay";
                }
                else {
                    burc = "Oğlak";
                }
            }
            else{
                isError = true;
            }
        }
        if (0> mount || mount>12){
            isError=true;
        }

        if (isError == true){
            System.out.println("hatalı sayı girdiniz...");
        }
        else{
            System.out.println("Burcunuz : " + burc);
        }
    }
}
