package sorting;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7,9,3,4,2,1,6,2};
        Sorting s = new quickSort();
        s.sort(arr);
        System.out.println("Quick sort :");
        for(int i : arr){
            System.out.print(i + " ");
        }
        s = new MergeSort();
        arr = new int[]{7,9,3,4,2,1,6,2};
        s.sort(arr);
        System.out.println("Merge sort :");
        for(int i : arr){
            System.out.print(i + " ");
        }
        s = new BubbleSort();
        arr = new int[]{7,9,3,4,2,1,6,2};
        s.sort(arr);
        System.out.println("Bubble sort :");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
