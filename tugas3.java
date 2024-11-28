public class tugas3 {
        public static int Fibonacci(int bulan) {
       if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return Fibonacci(bulan - 1) + Fibonacci(bulan - 2);
        }
            
    }
    public static void main(String[] args) {
        int bulan = 12;
        int pasanganMarmut = Fibonacci(bulan);
        System.out.println("Pasangan marmut pada bulan ke" + bulan + " adalah: " + pasanganMarmut);
    }
}   