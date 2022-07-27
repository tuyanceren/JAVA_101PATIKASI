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

Aldığım eğitimleri sizde almak isterseniz [patika.dev](https://app.patika.dev/paths) sayfasını ziyaret edebilirsiz.
