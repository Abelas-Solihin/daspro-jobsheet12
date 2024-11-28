import java.util.Scanner;
public class tugas2 {
    static int hitungPenjumlahan(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print(n + " + "); 
            return n + hitungPenjumlahan(n - 1);  
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka : ");
        int n = sc.nextInt();

        System.out.print("Hasil penjumlahan " + n + " = ");
        int hasil = hitungPenjumlahan(n);
        System.out.println(" = " + hasil);  
    }
}
