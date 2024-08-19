package sorting;

public interface Sorting {
    default void swap(int arr[],int i,int j){
        int t = arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    void sort(int arr[]);
}
