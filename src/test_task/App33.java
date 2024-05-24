package test_task;

public class App33 {

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int[] arrCheck = {1, 5, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arrCheck[i]) {
                System.out.println("Test failed");
                return;
            }
        }
        System.out.println();
        System.out.println("Test passed");
    }

    static void quickSort(int[] arr, int low, int high) { // O(n log n)
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); // left part of the array
            quickSort(arr, pi + 1, high); // right part of the array
        }
    }

    static int partition(int[] arr, int low, int high) { // O(n)
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (pivot > arr[j]) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
