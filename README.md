# JAVA_101PATIKASI
**Not Ortalaması Hesaplayan Program**
-
```java
import java.util.Scanner;
public class not_hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuzu girin :");
        int mat  = input.nextInt();
        System.out.print("fizik notunuzu girin :");
        int fizik  = input.nextInt();
        System.out.print("kimya notunuzu girin :");
        int kimya  = input.nextInt();
        System.out.print("türkçe notunuzu girin :");
        int turkce  = input.nextInt();
        System.out.print("tarih notunuzu girin :");
        int tarih  = input.nextInt();
        System.out.print("müzik notunuzu girin :");
        int müzik  = input.nextInt();

        double ort = (mat + fizik + kimya + turkce + tarih + müzik) / 6;

        String sonuc = ort >= 60 ? "geçti" : "kaldı";
        System.out.println("ortalamanız : " + ort);
        System.out.println(sonuc);
    }
}
```
**KDV Tutarı Hesaplayan Program**
-
```java
import java.util.Scanner;
public class kdv_tutarı {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("ürünün fiyatını giriniz :");
        double urunun_fiyati = input.nextDouble();

        double kdv_yuzdesi = 0.18;
        double kdv = urunun_fiyati * kdv_yuzdesi ;
        double kdvli_fiyat = kdv+urunun_fiyati;

        System.out.println("KDV'siz fiyat:" + urunun_fiyati + "\nKDV'li fiyat:" + kdvli_fiyat +"\nKDV tutarı:" + kdv);

    }
}
```
**Dik Üçgende Hipotenüs Bulan Program**
-
```java
import java.util.Scanner;

public class hipotenüs_bulma {
    public static void main(String[] args){
        Scanner kenarlar = new Scanner(System.in);
        System.out.print("kenar giriniz : ");
        int a = kenarlar.nextInt();
        System.out.print("kenar giriniz : ");
        int b = kenarlar.nextInt();
        double hipotenüs  = Math.sqrt((a*a) + (b*b));
        System.out.println("hiponetüs : " + hipotenüs);
    }
}
```
**Kenarları Verilen Üçgenin Alanını Bulma**
-
```java
import java.util.Scanner;

public class ucgenin_alanı {
    public static void main(String[] args){
        Scanner kenarlar = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        int a = kenarlar.nextInt();
        System.out.print("2. kenarı giriniz : ");
        int b = kenarlar.nextInt();
        System.out.print("3. kenarı giriniz : ");
        int c = kenarlar.nextInt();
        int cevre = (a+b+c)/2;
        double alan = Math.sqrt(cevre * (cevre-a) * (cevre-b) * (cevre-c));
        System.out.println("üçgeninizin alanı : " + alan);
    }
}
```
**Taksimetre Programı**
-
```java
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kaç km yol gidiceksiniz : ");
        int km = input.nextInt();
        double km_tutarı = 2.20;
        double acılıs_ücreti = 10;
        double odenicek_tutar = acılıs_ücreti +( km * km_tutarı ) ;
        System.out.print("ödenicek tutar : ");
        System.out.println(odenicek_tutar < 20 ? 20 : odenicek_tutar);
    }
}

```
**Daire Diliminin Alanı**
-
```java 
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
```
**Vücut Kitle İndeksi Hesaplama**
-
```java
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
```
**Manav Kasa Programı**
-
```java
import java.util.Scanner;

public class manav_kasa {
    public static void main(String[] args){
        Double Armut = 2.14 , Elma = 3.67 , Domates = 1.11 , Muz = 0.95 , Patlıcan = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print(" Armut kaç kilo ? " );
        double A = input.nextDouble();
        System.out.print(" Elma kaç kilo ? " );
        double E = input.nextDouble();
        System.out.print(" Domates kaç kilo ? " );
        double D = input.nextDouble();
        System.out.print(" Muz kaç kilo ? " );
        double M = input.nextDouble();
        System.out.print(" Patlıcan kaç kilo ? " );
        double P = input.nextDouble();

        double total = (Armut * A) + (Elma * E) + (Domates * D) + (Muz * M) + (Patlıcan * P) ;
        System.out.print("tutar : " + total);
    }
}
```
**Hesap Makinesi**
```java
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

```
**Kullanıcı Girişi**
-
```java
import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        String userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        String password = input.nextLine();
        if(userName.equals("Tuyanceren") && password.equals("1234")){
            System.out.println("kullanıcı girişi başaralı...");
        }
        else if (userName.equals("Tuyanceren") && !password.equals("1234")){
            System.out.println("şifre yanlış.\n"+"şifrenizi sıfırlamak ister misiniz? (evet/hayır)");
            String check = input.nextLine();
            switch(check){
                case "evet":
                    boolean a = true ;
                    while (a ==true) {
                        System.out.print("yeni şifrenizi girin :");
                        String new_password = input.nextLine();
                        if (new_password.equals("1234")) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        } else {
                            System.out.println("Şifre oluşturuldu.");
                            a = false;
                        }
                    }
                    break;
                case "hayır":
                    break;
            }
        }
        else{
            System.out.println("Bilgileriniz yanlış...");
        }
    }
}
```
**Sınıf Geçme Durumu**
-
```java
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
```
**Hava Sıcaklığına Göre Etkinlik Önerme**
-
```java
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
```
**Sayıları Büyükten Küçüğe Sıralama**
-
```java
import java.util.Scanner;

public class sayı_sıralama {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int a = input.nextInt();
        System.out.print("sayı giriniz : ");
        int b = input.nextInt();
        System.out.print("sayı giriniz : ");
        int c = input.nextInt();

        if (a>b && a>c && b>c){
            System.out.println(a + ">" +b+ ">" +c);
        }
        else if(a>b && a>c && c>b){
            System.out.println(a + ">" +c+ ">" +b);
        }
        else if(b>a && b>c && a>c){
            System.out.println(b + ">" +a+ ">" +c);
        }
        else if(b>a && b>c && c>a){
            System.out.println(b + ">" +c+ ">" +a);
        }
        else if(c>a && c>b && a>b){
            System.out.println(c + ">" +a+ ">" +b);
        }
        else{
            System.out.println(c + ">" +b+ ">" +a);
        }
    }
}
```
**Burç Bulan Program**
-
```java
import java.util.Scanner;

public class burc_bulma {
    public static void main(String[] args){
    
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

```
**Artık Yıl Hesaplama**
-
```java
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
```
**Uçak Bileti Fiyatı Hesaplama**
-
```java
import java.util.Scanner;

public class ucak_bileti_fiyatı {
    public static void main(String[] args){
        double km_ucreti = 0.10, yol_ucreti = 0.0 , indirim = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("HOŞGELDİNİZ...\n" +
                "******************************************************************\n" +
                "-Yolcu 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.\n" +
                "-Yolcu 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.\n" +
                "-Yolcu 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.\n" +
                "-Yolcu \"Yolculuk Tipini\" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.\n" +
                "******************************************************************");
        System.out.print("Mesafeyi km türünden giriniz : ");
        int km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        int yön = input.nextInt();

        yol_ucreti = km * km_ucreti;

        if (yas<12){
            yol_ucreti -= yol_ucreti * 0.5;
        }
        else if (yas>=12 && yas<=24){
            yol_ucreti -= yol_ucreti * 0.1;
        }
        else if (yas>65){
            yol_ucreti -= yol_ucreti * 0.3;
        }

        switch (yön){
            case 1:
                System.out.println("Toplam tutar : " + yol_ucreti);
                break;
            case 2:
                yol_ucreti -= yol_ucreti * 0.2;
                System.out.println("Toplam tutar : " + 2 * yol_ucreti);
        }
    }
}

```
**Çin Zodyağı Hesaplama**
-
```java
import java.util.Scanner;

public class cin_zodyagı {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz : ");
        int yıl = input.nextInt();
        int aralık = yıl % 12;
        String zodyag = null;
        switch(aralık){
            case 0:
                zodyag = "Maymun";
                break;
            case 1:
                zodyag = "Horoz";
                break;
            case 2:
                zodyag = "Köpek";
                break;
            case 3:
                zodyag = "Domuz";
                break;
            case 4:
                zodyag = "Fare";
                break;
            case 5:
                zodyag = "Öküz";
                break;
            case 6:
                zodyag = "Kaplan";
                break;
            case 7:
                zodyag = "Tavşan";
                break;
            case 8:
                zodyag = "Ejderha";
                break;
            case 9:
                zodyag = "Yılan";
                break;
            case 10:
                zodyag = "At";
                break;
            case 11:
                zodyag = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz : " + zodyag);
    }
}

```
**Girilen Sayıya Kadar Olan Sayıların 3'e Ve 4'e Bölünenlerin Toplamı Bulma**
-
```java
import java.util.Scanner;

public class sayı_yazdırma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int sayı = input.nextInt();
        int toplam = 0;

        for(int i = 1 ; i <= sayı ; i++){
            if ( i%3 == 0 && i%4 == 0){
                toplam += i;
            }
        }
        System.out.println("girdiğiniz sayıya kadar olan sayılardan 3'e ve 4'e bölünebilen sayıların toplamı : " + toplam);
    }
}

```
**Verilen Kosullara Uygun Sayıların Toplamı**
-
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program.
```java
import java.util.Scanner;

public class verilenKosullaraUygunSayılarınToplamı {
    public static void main(String[] args){
        int sayı ;
        int toplam=0 ;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz : ");
            sayı = input.nextInt();
            if(sayı%4==0 && sayı%2==0){
                toplam += sayı ;
            }
        }
        while(sayı%2==0);
            System.out.println("toplam : " + toplam);
    }
}

```
**Girilen Sayıya Kadar Olan 4 Ve 5'in Kuvvetlerini Ekrana Yazdıran Program**
-
```java
import java.util.Scanner;

public class girilen_sayiya_kadar_olan_4_ve_5_in_kuvvetlerini_yazdir {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayı = input.nextInt();
        
        for (int i=1 ,j=1; i<=sayı ; i*=4,j*=5){
            System.out.println(i + "\n" + j);
        }
    }
}
```
**Kombinasyon Hesaplayan Program**
-
```java
import java.util.Scanner;

public class kombinasyon_bulma {
    public static int faktoriyel (int a){
        int total = 1;
        for (int i = 1; i <= a; i++) {
        total = total * i ;
        }
        return total;
    }

    public static void main(String[] args){
        int n ;
        int r ;
        int c ;

        Scanner input = new Scanner(System.in);
        System.out.println("kombinasyonu hesaplanıcak sayıları giriniz... ");
        n =input.nextInt();
        r =input.nextInt();

        c =faktoriyel(n)/(faktoriyel(r)* faktoriyel((n-r)));
        System.out.println("kombinasyon : " + c);
    }
}
```
**Üslü Sayı Hesaplayan Program**
-
```java
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
```
**Bir Sayının Rakamları Toplamını Hesaplayan Program**
-
```java
import java.util.Scanner;

public class sayının_rakamlarını_toplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        int sayı = input.nextInt();
        int basamak_sayısı=0;
        int toplam=0;
        
        while(sayı>0){
            toplam += sayı%10;
            sayı/=10;
            basamak_sayısı++;
        }
        System.out.println("Sayının rakamları toplamı : " + toplam);
    }
}

```
**Bir Sayının Harmonik Serisini Bulan Program**
-
```java
import java.util.Scanner;

public class harmonik_sayılar {
    public static void main(String[] args){

        int sayı;
        double toplam=0.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        sayı = input.nextInt();

        for(double i=1 ; i<= sayı ; i++){
            toplam += 1/i;
        }
        System.out.println("harmonik sayısı : " + toplam);
    }
}
```
Aldığım eğitimleri sizde almak isterseniz [patika.dev](https://app.patika.dev/paths) sayfasını ziyaret edebilirsiz.
