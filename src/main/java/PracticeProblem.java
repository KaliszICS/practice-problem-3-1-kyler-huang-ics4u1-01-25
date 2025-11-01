class PracticeProblem {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(234));   // 9
        System.out.println(sumOfDigits(12));    // 3
        System.out.println(sumOfDigits(39));    // 12
        System.out.println(sumOfDigits(-12));   // 3

        System.out.println(factorial(5));       // 120
        System.out.println(factorial(0));       // 1
        System.out.println(factorial(-3));      // 0
    }

    public static int sumOfDigits(int x) {
        if (x < 0) x = -x;
        if (x < 10) return x;
        return (x % 10) + sumOfDigits(x / 10);
    }

    public static int factorial(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
