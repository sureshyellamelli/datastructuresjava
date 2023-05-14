package com.skywood.skywoodexamples.arrays;

public class CountNoOfOccurenceInSortedArray {


    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 7, 8, 8}, x = 3;

        int mid = findElement(arr, x);

        System.out.print(x + " Occured in " + findCount(arr, mid, x) + " times");



    }

    private static int findCount(int[] arr, int mid, int x) {

        int count = 0;
        return findLeftCount(arr, mid, count, x) + findRightCount(arr, mid, count, x);
    }

    private static int findRightCount(int[] arr, int mid, int count, int x) {

        for (int i = mid + 1; ; i++) {
            if (arr[i] == x)
                count++;
            else
                break;
        }
        return count;
    }

    private static int findLeftCount(int[] arr, int mid, int count, int x) {

        for (int i = mid; ; i--) {
            if (arr[i] == x)
                count++;
            else
                break;
        }
        return count;
    }

    private static int findElement(int[] a, int x) {
        int low = 0;
        int high = a.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + (high - low)) / 2;
            if (a[mid] == x)
                return mid;
            if (x > mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return mid;
    }
}
