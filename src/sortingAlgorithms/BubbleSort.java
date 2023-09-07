package sortingAlgorithms;

public class BubbleSort {
	public static void print(int []arr,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
public static void bubbleSort(int []arr,int n) {
	for(int i=0;i<n;i++) {                 //n-1
		for(int j=0;j<n-i-1;j++) {			//n+(n-1)+(n-2)+(n-3)+1
			if(arr[j]>
			arr[j+1]) {
				//swap
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
	public static void main(String[] args) {
		int []arr= {7,8,3,1,2};
		int n=arr.length;
		bubbleSort(arr,n);
		print(arr,n);
		

	}

}
//Time Complexity:- O(n^2)