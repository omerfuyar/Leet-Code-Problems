public class Longest_Common_Prefix {

    // --------------------------------------------------------------------------------------

    // Runtime : ~13000 NanoSecods
    static String longestCommonPrefix_1(String[] strs) {
        if (strs.length == 0)
            return "";

        String Result = strs[0];

        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(Result) != 0) {
                Result = Result.substring(0, Result.length() - 1);
                if (Result.isEmpty())
                    return "";
            }

        return Result;
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String Result = longestCommonPrefix_1(new String[] { "abcd", "abc", "abd" });

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("Result : " + Result);
    }
}