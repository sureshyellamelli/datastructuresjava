package com.skywood.skywoodexamples.arrays;

public class BestSearchWithSortedElements {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int itemToSearch = 9;
        int result = binarySearch(a, itemToSearch);
        System.out.print("Result: " + result);

    }

    static int binarySearch(int[] a, int itemToSearch) {

        int first = 0;
        int last = a.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (a[mid] == itemToSearch)
                return mid;
            else if (a[mid] > itemToSearch) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }
}
