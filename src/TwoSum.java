import java.util.HashMap;
import java.util.Map;
public class TwoSum {
    public int[] twoSums(int [] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < numbers.length; index ++) {
            int complement = target - numbers[index];

            if(map.containsKey(complement)) {
                return new int [] {map.get(complement), index};
            }
            map.put(numbers[index], index);
        }
        throw new IllegalArgumentException("Không tìm thấy cặp số nào thỏa mãn.");
    }
}
