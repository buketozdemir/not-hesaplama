import java.util.Scanner;

public class Not {
    public static void main(String[] args) {
        int mat,fen,turk,sos,ing;
        double ort;
        Scanner imp = new Scanner(System.in);
        System.out.println("Matematik'ten kaç aldın?");
        mat= imp.nextInt();
        System.out.println("Fen Bilimleri'nden kaç aldın?");
        fen= imp.nextInt();
        System.out.println("Turkce'den kaç aldın?");
        turk= imp.nextInt();
        System.out.println("Sosyal'den kaç aldın?");
        sos= imp.nextInt();
        System.out.println("İngilizce'den kaç aldın?");
        ing= imp.nextInt();
        double toplam=mat+fen+turk+sos+ing;
        ort= toplam/5;
        String durum = ort>=70? " geçtin": " kaldın";
        System.out.println("Ortalamanız = "+ort+ durum);

    }
}
