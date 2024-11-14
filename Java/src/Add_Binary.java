public class Add_Binary {

    // --------------------------------------------------------------------------------------

    // Runtime : ~ NanoSecods
    static String addBinary(String a, String b) {
        // Directly binary sum no need to convert real integer.
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        String Result = addBinary("1111", "10000");

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("result : " + Result);
    }
}
