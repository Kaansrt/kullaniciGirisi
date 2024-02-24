import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password,secim;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifrniz : ");
        password = inp.nextLine();

        // java da stringlerde eşitliği equals ile yaparız. İçine yazılan yapı ile girilen eşit ise true döner.
        if (userName.equals("kaanS") && password.equals("asd123")) {
            System.out.println("Başarıyla giriş yaptınız.");
        }
        else {
            System.out.println("Kullanıcı adı ya da şifre yanlış! ");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            secim = inp.nextLine();
            if (secim.equals("Evet")) {
                System.out.print("Yeni bir şifre giriniz : ");
                password = inp.nextLine();
                if (!password.equals("asd123")) {
                    System.out.println("Şifre başarıyla oluşturuldu. Yeni şifreniz : "+ password);
                }
                else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }

            }
            else {
                System.out.println("Çıkış yapılıyor");
            }
        }

    }
}