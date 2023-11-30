package oops_basic;

public class Position {
    static int arr[] = {1, 2, 5, 6, 7, 9};
    static int n = 4;

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("The position of " + arr[i] + " is " + i);
            }
        }
    }
}
