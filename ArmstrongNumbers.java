public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000 are:");

        for (int number = 1; number <= 1000; number++) {
            int original = number;
            int sum = 0;
            int digits = countDigits(number);

            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, digits);
                number /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }

            number = original;
        }
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
