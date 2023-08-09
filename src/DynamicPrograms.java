import java.util.HashMap;

public class DynamicPrograms {

    public static int getFinonacci(int n, HashMap<Integer, Integer> memo) {
        if (n <= 2) return 1;
        if (memo.containsKey(n)) return memo.get(n);

        int result = getFinonacci(n - 1, memo) + getFinonacci(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    public static int gridTraveller(int m, int n, HashMap<String, Integer> memo) {
        String key = m + "," + n;
        if (memo.containsKey(key)) return memo.get(key);
        if (m == 1 && n == 1) return 1;
        if (m < 0 || n < 0) return 0;

        int result = gridTraveller(m - 1, n, memo) + gridTraveller(m, n - 1, memo);
        memo.put(key, result);
        return result;
    }

    public static boolean canSum(int target, int[] values, HashMap<Integer, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target == 0) return true;
        if (target < 0) return false;

        for (int item : values) {
            if (canSum(target - item, values, memo)) {
                memo.put(target, true);
                return true;
            }
        }

        memo.put(target, false);
        return false;
    }

}
