import java.util.Scanner;
public class KucukSayi {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Lütfen sayıları teker teker girip entera basın. Bitirmek için 'son' yazıp entera basın");
            //girilen sayıları bitirmek için klavyeden herhangi bir tuş da girilebilir.
            double enbuyuk = in.nextDouble();
            double enkucuk = enbuyuk;
            while (in.hasNextDouble()) {
                double input = in.nextDouble();
                enkucuk = Math.min(enkucuk, input); //Girilenler arasından en küçük değere sahip olan sayının tespit edilmesi ven "enkucuk" olarak tanımlanması
            }
            System.out.println("En küçük sayı " + enkucuk); //Enkucuk tanımının yazdırılması
        } catch (Exception e) {
        }
    }
}
