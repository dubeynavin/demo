class Program3{
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Add leading spaces
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}