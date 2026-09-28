// Problem: Array ko reverse karna | Basic practice
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = arr.length - 1;

        // Left aur right ke elements ko swap karo
        // Dono pointers center ki taraf move karenge
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Reversed array print kar rahe hain
        for (int value : arr) System.out.print(value + " ");
    }
}
