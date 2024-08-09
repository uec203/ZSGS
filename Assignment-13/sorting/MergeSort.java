package sorting;

public class MergeSort implements Sorting{
    private void merger(int arr[],int i,int mid,int j){
        int start=i,k = mid+1,index=0;
        int arr1[] = new int[j-i+1];
        while(i<=mid && k<=j){
            if(arr[i]<=arr[k]){
                arr1[index++]=arr[i++];
            }
            else{
                arr1[index++]=arr[k++];
            }
        }
        while(i<=mid) arr1[index++]=arr[i++];
        while(k<=j) arr1[index++]=arr[k++];
        index=0;

        for(i=start;i<=j;i++){
            arr[i]=arr1[index++];
        }
    }
    private void mergeSort(int arr[],int i,int j){
        if(i>=j) return;
        int mid = (i+j)/2;
        mergeSort(arr, i, mid);
        mergeSort(arr, mid+1, j);
        merger(arr,i,mid,j);
    }
    public void sort(int arr[]){
        mergeSort(arr,0,arr.length-1);
    }
}
