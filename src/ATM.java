import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        String userName, password;
        int right = 3;
        int balance = 1500;
        int func;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();

            System.out.print("Şifrenizi Giriniz: ");
            password = input.nextLine();

            if (userName.equals("Metehan") && password.equals("123")) {
                do {
                    System.out.println("X Bankasına Hoşgeldiniz! ");
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: \n1-) Para Yatırma " +
                            "\n2-) Para Çekme" +
                            "\n3-) Bakiye Sorgula" +
                            "\n4-) Çıkış Yap  ");
                    func = input.nextInt();
                    switch (func) {
                        case 1 -> {
                            System.out.print("Lütfen Yatıracağınız Para Miktarını Giriniz: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("Yeni Bakiyeniz: " + balance);
                        }
                        case 2 -> {
                            System.out.print("Lütfen Çekeceğiniz Para Miktarını Giriniz: ");
                            int withdraw = input.nextInt();
                            if (withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("Yeni Bakiyeniz: " + balance);
                            }else{
                                System.out.println("Yetersiz Bakiye!");
                            }
                        }
                        case 3 -> {
                            System.out.println("Bakiyeniz: " + balance);
                        }
                        case 4 -> {
                            System.out.println("Kartınızı Unutmayınız!!! ");
                        }
                        default -> {
                            System.out.println("Hatalı Tuşlama Yaptınız! ");
                        }
                    }


                } while (func != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı Veya Şifre!");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Edilmiştir! ");
                } else {
                    System.out.println("Kalan Hatalı Giriş Yapma Hakkınız: " + right);
                }
            }
        }

    }
}