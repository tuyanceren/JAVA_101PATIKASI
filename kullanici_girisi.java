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
