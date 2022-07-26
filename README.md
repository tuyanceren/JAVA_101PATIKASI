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
Aldığım eğitimleri sizde almak isterseniz [patika.dev](https://app.patika.dev/paths) sayfasını ziyaret edebilirsiz.
