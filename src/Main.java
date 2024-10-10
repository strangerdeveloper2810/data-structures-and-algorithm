
public class Main {
    public static void main(String[] args) {
        TwoSum twoSumResolver = new TwoSum();
        int [] numbers = {2,5,7,11,15};
        int target = 9;
        int [] result = twoSumResolver.twoSums(numbers, target);

        // In ra kết quả
        System.out.println("Cặp chỉ số: [" + result[0] + ", " + result[1] + "]");
    }
}