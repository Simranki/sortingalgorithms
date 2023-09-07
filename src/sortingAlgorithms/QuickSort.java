package sortingAlgorithms;

public class QuickSort {
	public static int partition(int []arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		//for pivot
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		return i;
	}
public static void quickSort(int[]arr,int low,int high) {
	if(low<high) {
		int pivotIdx=partition(arr,low,high);
		
	
	quickSort(arr,low,pivotIdx-1);
	quickSort(arr,pivotIdx+1,high);
	}
	
}
	public static void main(String[] args) {
		int arr[]= {6,3,9,5,2,8};
		int n=arr.length;
		quickSort(arr,0,n-1);
		//print
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
