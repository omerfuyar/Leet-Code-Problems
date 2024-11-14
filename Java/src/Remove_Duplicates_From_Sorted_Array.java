public class Remove_Duplicates_From_Sorted_Array {

    // --------------------------------------------------------------------------------------

    // Runtime : ~2700 NanoSecods
    static int removeDuplicates_1(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                k++;
                nums[k - 1] = nums[i];
            }
        }

        return k;
    }

    // --------------------------------------------------------------------------------------

    // Runtime : ~2450 NanoSecods
    static int removeDuplicates_2(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int Result = removeDuplicates_2(new int[] { 1, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7, 31, 31 });

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("result : " + Result);
    }
}