import java.util.Scanner;

public class simetrikMatris {
    public static void matris(){
        Scanner k = new Scanner(System.in);
        System.out.println("Matris Boyutunu Giriniz: ");
        int n = k.nextInt();
        // n*n lik bir matris oluşturuyoruz
        int [][] matris = new int[n][n];
        //bu matris için değerlerimizi giriyoruz.
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("[" + i + "]" + "[" + j + "]" + " için değer giriniz: ");
                matris[i][j] = k.nextInt();
            }
        }
        /*matrisin içerisindeki değerleri simetrik olup olmaması koşuluna göre dönüyoruz. Burda önemli olan iki nokta var. Birincisi
          kontrol sağladımız değerleri tekrardan kontrol etmemek için i<j koşulunu koyduk.
          İkinci durum isedizinin [i][j] değerlerinin eşit olduğu durumları yani istenen durumu karşılayıp karşılamadığı durumların
           kontrolünü sağlamak */
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                System.out.print(matris[i][j]);
                if (i<j){
                    if (matris[i][j] == matris[j][i]){
                        System.out.println("simetriktir");
                    }else System.out.println("simetrik değil");
                }
            }
            System.out.println();
        }
    }
}
