import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    // --------------------------------------------------------------------------------------

    static int[] twoSum_1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    // --------------------------------------------------------------------------------------

    // Runtime : ~2500 NanoSeconds
    static int[] twoSum_2(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = arr[1] = -1;

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int take = nums[i];
            int need = target - take;
            if (map.containsKey(need)) {
                arr[0] = i;
                arr[1] = map.get(need);
                return arr;
            }
            map.put(nums[i], i);
        }

        return arr;
    }

    // --------------------------------------------------------------------------------------

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int[] Result = twoSum_1(new int[] { 1, 2, 33, 30 }, 31);

        long endTime = System.nanoTime();

        long ElapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds : " + ElapsedTime);

        System.out.println("Result : " + Result);
    }
}