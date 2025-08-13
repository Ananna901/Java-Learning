public class Five {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        System.out.println("Largest: " + (a > b ? (a > c ? a : c) : (b > c ? b : c)));
    }
}