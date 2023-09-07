package sortingAlgorithms;

public class InsertionSort {
	public static void print(int []arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void insertionSort(int []arr,int n) {
		for(int i=1;i<n;i++) {
			int current=arr[i];
			int j=i-1;		//to track the sorted part
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
		
		//placement
		arr[j+1]=current;
		}
		print(arr,n);
	}

	public static void main(String[] args) {
	int []arr= {7,8,3,1,2};
	int n=arr.length;
	insertionSort(arr,n);

	}

}

//Time complexity: O(n^2)
