package KdvHesaplamaProgrami;

import java.util.Scanner;
public class KdvHesaplayanProgram {
    public static void main(String[] args) {
        double kdvOran =0.18;
        Scanner scan = new Scanner(System.in);
        System.out.println("ürünün tutarını giriniz:" );
        double tutar = scan.nextDouble();
        if (tutar <=1000.0){
            kdvOran =0.18;
        }else {
            kdvOran = 0.8;
        }
        double kdvTutar = tutar + kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("kdvli tutar :" + kdvliTutar);
    }
}
