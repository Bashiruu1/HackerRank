import java.util.*;

class Solution{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int consecutiveNCount = 0;
        int maxConsecutiveCount = 0;

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binary = Integer.toBinaryString(n);
        scanner.close();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                consecutiveNCount += 1;
                maxConsecutiveCount = Math.max(consecutiveNCount, maxConsecutiveCount);
            } else {
                consecutiveNCount = 0;
            }
        }
        System.out.println(maxConsecutiveCount);

    }
}
