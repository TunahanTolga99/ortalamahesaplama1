import java.util.Scanner;
public class ortalama1 {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,tar,muz;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fiz = input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz : ");
        tur = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : ");
        kim = input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz : ");
        tar = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz : ");
        muz = input.nextInt();

        int toplam = (mat+fiz+tur+kim+tar+muz);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);
        String b = (sonuc >=60) ? "Sınıfı Geçtiniz ! " : "Sınıfı Geçemediniz ! ";
        System.out.println(b);
    }
}
