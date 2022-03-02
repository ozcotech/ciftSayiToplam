import java.util.Scanner;
/**
 * ciftSayiToplam
 */
public class ciftSayiToplam {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int i, total = 0;

    
    do {
      System.out.print("Bir Sayı Giriniz: ");
      i = scan.nextInt();
      if (i % 2 == 0 && i % 4 == 0){

        total += i; 

      }

    } while (i % 2 != 1);

    System.out.println("Girilen Çift ve 4'e Bölünebilen Sayıların Toplamı: " + total);

    scan.close();
    
  }
}