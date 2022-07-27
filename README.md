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

Aldığım eğitimleri sizde almak isterseniz [patika.dev](https://app.patika.dev/paths) sayfasını ziyaret edebilirsiz.
