package sorting;

public class BubbleSort implements Sorting{
    public void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    Sorting.swap(arr, j, j+1);
                }
            }
        }
    }
}
