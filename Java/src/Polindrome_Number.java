import java.util.Arrays;

public class Polindrome_Number {

    // --------------------------------------------------------------------------------------

    // Runtime : ~130000 NanoSecods
    static boolean isPalindrome_1(int x) {
        String x_firsthalf = Integer.toString(x).substring(0,
                (int) Integer.toString(x).length() / 2);

        String x_secondhalf = Integer.toString(x).length() % 2 == 0
                ? Integer.toString(x).substring((int) Integer.toString(x).length() / 2,
                        Integer.toString(x).length())
                : Integer.toString(x).substring((int) Integer.toString(x).length() / 2 + 1,
                        Integer.toString(x).length());

        char[] tempchar = x_secondhalf.toCharArray();
        char[] x_secondhalf_char = new char[x_secondhalf.length()];

        for (int i = 0; i < tempchar.length; i++) {
            x_secondhalf_char[i] = tempchar[tempchar.length - i - 1];
        }

        if (new String(x_secondhalf_char).equals(x_firsthalf))
            return true;
        else
            return false;
    }

    // --------------------------------------------------------------------------------------

    // Runtime : ~130000 NanoSeconds
    static boolean isPalindrome_2(int x) {
        int DigitCount = 0;
        while (x % Math.pow(10, DigitCount) != x)
            DigitCount++;

        int[] Digits = new int[DigitCount];
        for (int i = 0; i < DigitCount; i++)
            Digits[i] = ((x % (int) Math.pow(10, i + 1)) - (x % (int) Math.pow(10, i)))
                    / (int) Math.pow(10, i);

        int[] ReversedDigits = new int[DigitCount];
        for (int i = 0; i < DigitCount; i++)
            ReversedDigits[i] = Digits[DigitCount - i - 1];

        if (Arrays.equals(ReversedDigits, Digits) && x >= 0)
            return true;
        else
            return false;
    }

    // --------------------------------------------------------------------------------------

    // Runtime : ~2000 NanoSeconds
    static boolean isPalindrome_3(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        boolean Result = isPalindrome_3(122221);

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("Result : " + Result);
    }
}