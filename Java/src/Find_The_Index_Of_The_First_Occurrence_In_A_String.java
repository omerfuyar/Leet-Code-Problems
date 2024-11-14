public class Find_The_Index_Of_The_First_Occurrence_In_A_String {

    // --------------------------------------------------------------------------------------

    // Runtime : ~7000 NanoSecods
    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int Result = strStr("always further", "fur");

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("result : " + Result);
    }
}