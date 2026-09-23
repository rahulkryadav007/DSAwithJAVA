// Problem: Reverse an Array | Basic practice
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = arr.length - 1;
        // Dono ends ke elements swap karo, pointers center ki taraf badhenge.
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int value : arr) System.out.print(value + " ");
    }
}
