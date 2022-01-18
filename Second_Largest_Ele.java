
public class Second_Largest_Ele {

    // Time Complexity : O(n)
    public static int findSecondLarge(int[] arr, int len) {
        System.out.println(len);
        int i, large = 0, secondLarge = -1; //  stores index
        for (i = 1; i < len; i++) {
            if (arr[i] > arr[large]) {
                secondLarge = large;
                large = i;
            }
            else {
                if (secondLarge == -1 || arr[secondLarge] < arr[i])
                    secondLarge = i;
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 66, 4, 22 };
        int len = arr.length, ans = findSecondLarge(arr, len);
        System.out.println("Second Largest Element in the array : " + arr[ans]);
    }
}
