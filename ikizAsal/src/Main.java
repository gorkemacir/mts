import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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




/*public class IkizAsalSayilar {
   public static void main(String[] args) {
      int baslangic = 3, bitis = 100; // aralık
      for(int sayi = baslangic; sayi <= bitis; sayi++) {
         if(isAsal(sayi) && isAsal(sayi+2)) {
            System.out.println(sayi + " ve " + (sayi+2) + " ikiz asal sayılardır.");
         }
      }
   }

   // bir sayının asal olup olmadığını kontrol eden method
   public static boolean isAsal(int sayi) {
      if(sayi < 2) return false;
      for(int i=2; i<=Math.sqrt(sayi); i++) {
         if(sayi%i == 0) return false;
      }
      return true;
   }
}*/