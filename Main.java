package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri Oluştur
        int mat, fizik, kimya,turkce,tarih,muzik;

        //Scanner sınıfımızı tanımlarız
        Scanner inp = new Scanner(System.in);

        // Kullanıcadan değerleri al
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + muzik + tarih);
        double sonuc = toplam /6;

        System.out.println("Not Ortalamanız : " + sonuc);
        boolean kaldi = sonuc >= 60;
        String str = kaldi ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(str);
    }
}
