// Sakeus - 12S25038 //

import java.util.*;
import java.lang.Math;
public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, hasil;

        x = Integer.parseInt(input.nextLine());
        System.out.println("Bilangan yang dimasukkan : " + x);
        angka(x);
        System.out.println("Hasil perhitungan rekursif : " + angka(x));
    }
    
    public static void angka(int x) {
        int result, hasilb;

        if (x == 1) {
            result = 1;
        } else {
            hasilb = angka(x - 1);
            result = x + hasilb;
        }
    }
}
