import java.util.Scanner;

public class ikizAsal {
    public static void asal(){
        Scanner k = new Scanner(System.in);
        System.out.println("Başlangıç sayısını girin (Tercihen 3 ile başlayabiliriz!)");
        int sayi1 = k.nextInt();
        System.out.println("Hangi sayıya kadar kontrol sağlanacak?");
        int sayi2 = k.nextInt();

        for(int i = sayi1; i <= sayi2; i++) {
            if(asalMi(i) && asalMi(i+2)) {
                System.out.println(i  + " "+  (i+2));
            }
        }
    }
    public static boolean asalMi(int sayi){
        for (int i = 2; i<sayi; i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }
}

