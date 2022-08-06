import java.util.Scanner;

public class ATM {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int balance = 3;
        String select ;
        int bakiye =5500;
        int miktar;

        String user_name , password ;
        while(balance>0) {
            System.out.print("kullanıcı adınız : ");
            user_name = input.nextLine();
            System.out.print("şifrenizi giriniz : ");
            password = input.nextLine();
            if (user_name.equals("tuyanceren") && password.equals("1234")) {
                System.out.println("Bankamıza Hoşgeldiniz.");
                do {
                    System.out.println("İŞLEMLER\n" +
                            "1->Bakiye sorgulama \n" +
                            "2->Para Çekme \n" +
                            "3->Para Yatırma \n" +
                            "q->Çıkış ");
                    System.out.println("Lütfen işlem seçiniz : ");
                    select = input.nextLine();
                    switch (select) {
                        case ("1"):
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                        case ("2"):
                            System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                            miktar = input.nextInt();
                            if (bakiye - miktar < 0) {
                                System.out.println("Bakiyeniz yetersiz...\n" +
                                        "Bakiyeniz : " + bakiye);
                            } else {
                                bakiye -= miktar;
                                System.out.println("İşlem başarılı...\n" +
                                        "Kalan bakiyeniz :" + bakiye);
                            }
                            break;
                        case ("3"):
                            System.out.print("Yatırmak istediğiniz miktarı giriniz : ");
                            miktar = input.nextInt();
                            bakiye += miktar;
                            System.out.println("İşlem başarılı ...\n" +
                                    "Yeni bakiyeniz : " + bakiye);
                            break;
                    }
                }

                    while(!select.equals("q"));
                    System.out.println("Çıkışınız yapıldı. İyi günler dileriz...");
                    break;

            }
            else{
                balance--;
                if (balance==0){
                    System.out.println("hakkınız kalmamıştır. İyi günler ...");
                }
                else {
                    System.out.println("Bilgileriniz doğru değil.Lütfen tekrar deneyiniz.\n" +
                            "kalan hakkınız : " + balance);
                }
            }

        }
    }
}
