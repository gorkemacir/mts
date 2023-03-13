import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("Faktoriyon kontrolü sağlamak istediğiniz sayıyı giriniz: ");
        int sayi = k.nextInt();
        int toplam = 0,basamak,faktoriyel = 1;
        //gelen sayıyı basamaklarına ayıracağımız kısım
        List<Integer> basamaklar = new ArrayList<Integer>();
        basamaklar.add(sayi);
        while(sayi>0){
            basamak = sayi % 10;
            sayi = sayi / 10;
        }
        //faktoriyel hesabını yazacağımız kısım
        for (int i =0; i < basamaklar.size(); i++){
            for (int j = i; j <= 0; j--){
                faktoriyel = faktoriyel * j;
            }
            toplam = toplam + faktoriyel;
        }
        System.out.println(faktoriyel);
        //girilen sayının faktoriyon olup olmadığını kontrol ediyoruz
        if(toplam == sayi){
            System.out.println("Bu bir faktoriyon sayıdır.");
        }else System.out.println("Bu sayı faktoriyon sayı değildir.");
    }

}