public class Length_Of_Last_Word {

    // --------------------------------------------------------------------------------------

    // Runtime : ~300000 NanoSecods
    static int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length - 1].length();
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int Result = lengthOfLastWord("Always Further");

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("result : " + Result);
    }
}