package sorting;
public class quickSort implements Sorting{
    private int quick(int arr[],int i,int j){
        int pivotIndex = i;
        i++;
        while(i<j){
            while(i<=j && arr[i]<arr[pivotIndex] ) i++;
            while(j>=i && arr[j]>arr[pivotIndex]) j--;
            if(i<j) Sorting.swap(arr,i,j);
        }
        Sorting.swap(arr,pivotIndex,j);
        return j;
    }
    private void quickSorting(int[] arr,int i,int j){
        if(i>=j) return;
        int pivot = quick(arr,i,j);
        quickSorting(arr, i,pivot-1);
        quickSorting(arr, pivot+1, j);
    }
    public void sort(int arr[]){
        quickSorting(arr,0,arr.length-1);
    }
}
