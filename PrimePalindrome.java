public class PrimePalindrome {
    public static void main(String[] args) {
        int num = 29; // Test number here
        if (isPrime(num)) {
            System.out.println(nextPalindrome(num));
        } else {
            System.out.println("not prime");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    static int nextPalindrome(int n) {
        while (true) {
            n++;
            if (isPalindrome(n)) return n;
        }
    }

    static boolean isPalindrome(int n) {
        int rev = 0, orig = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return orig == rev;
    }
}

