package test_task;

public class App32 {

    public static void main(String[] args) {
        long[] arr = {2, 4, 1, 3, 5};
        long count = inversionCount(arr);
        System.out.println(count);
        System.out.println(count == 3);
    } // TC: O(n log n), SC: O(n)

    static long inversionCount(long[] arr) {
        int left = 0, right = arr.length - 1;
        return mergeSort(arr, left, right);
    }

    static long mergeSort(long[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }

    static long merge(long[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        long[] A = new long[n1];
        long[] B = new long[n2];
        for (int i = 0; i < n1; i++) {
            A[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            B[j] = arr[mid + 1 + j];
        }
        int count = 0;
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (A[i] > B[j]) {
                count = mid - (left + i) + 1;
                arr[k++] = B[j++];
            } else {
                arr[k++] = A[i++];
            }
        }
        while (i < n1) arr[k++] = A[i++];
        while (j < n2) arr[k++] = B[j++];
        return count;
    }
}
