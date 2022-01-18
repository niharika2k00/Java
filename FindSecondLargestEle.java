
public class FindSecondLargestEle {

    public static void findSecondLarge(int[] arr, int len) {
        System.out.println(len);
        int i, large = 0, secondLarge = -1; //  stores index
        for (i = 1; i < len; i++) {
            if (arr[i] > arr[large]) {
                secondLarge = large;
                large = arr[i];
            }
            else {
                if (secondLarge == -1 || arr[secondLarge] < arr[i])
                    secondLarge = i;
            }
        }
        // return secondLarge;
        System.out.println(secondLarge);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 66, 4, 22 };
        int len = arr.length;
        // int ans = findSecondLarge(arr, len);
        findSecondLarge(arr, len);
        System.out.println("Second Largest Element in the array : " + len);
    }
}
