package sortingAlgorithms;

public class SelectionSort {
	public static void print(int []arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void selectionSort(int []arr,int n) {
		for(int i=0;i<n-1;i++) {
		int smallest=i;
		for(int j=i+1;j<n;j++) {
			if(arr[smallest]>arr[j]) {
				smallest=j;
			}
		}
				//swap
				int temp=arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
			
		
		}
		print(arr,n);
	}

	public static void main(String[] args) {
		int arr[]= {7,8,3,1,2};
		int n=arr.length;
		selectionSort(arr,n);
		

	}

}
//Time complexity:-O(n^2)