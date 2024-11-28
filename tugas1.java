import java.util.Scanner;
public class tugas1 {
    static int deretDescendingRekursif(int n) {
        if (n == 0) {
            return (0);

        } else {
            System.out.println(n);
        return deretDescendingRekursif(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka : ");
        int n = sc.nextInt();
        System.out.println("Fungsi pada rekursif : ");
        System.out.println( deretDescendingRekursif(n)); 
    }
}
