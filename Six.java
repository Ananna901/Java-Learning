public class Six {
    public static void main(String[] args) {
        int n = 13;
        boolean prime = n > 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");
    }
}
