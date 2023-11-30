package oops_basic;

public class Sort {
    static int arr[] = {12, 34, 56, 79, 76, 42, 9};

    public static void main(String[] args) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int index = i;

            // Find the index of the minimum element in the remaining part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            // Swap the found minimum element with the current element
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
