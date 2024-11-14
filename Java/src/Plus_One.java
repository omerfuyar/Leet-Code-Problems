import java.math.BigInteger;

public class Plus_One {

    // --------------------------------------------------------------------------------------

    // Runtime : ~1000000 NanoSecods
    static int[] plusOne_1(int[] digits) {
        String BigSum = "";

        for (int i = 0; i < digits.length; i++)
            BigSum += digits[i];

        BigInteger BigSumL = new BigInteger(BigSum);
        BigSumL = BigSumL.add(BigInteger.ONE);
        BigSum = BigSumL.toString();
        int[] NewDigits = new int[BigSum.length()];

        for (int i = 0; i < NewDigits.length; i++)
            NewDigits[i] = Integer.parseInt(Character.toString(BigSum.charAt(i)));

        return NewDigits;
    }

    // --------------------------------------------------------------------------------------

    // Runtime : ~2200 NanoSecods
    static int[] plusOne_2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int[] Result = plusOne_2(new int[] { 3, 1, 3, 0, 9 });

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("result : " + Result);

        for (int i : Result) {
            System.out.print(i + " ");
        }
    }
}