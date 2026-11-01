public class MaxMin {
//Can you find both maximum and minimum in one traversal?
// Yes. The above solution does that in O(n) time and O(1) auxiliary space.
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}