


public class BinarySearchAlgo {
	
	public int binarysearch(int key,int arr[]) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid =(low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]<mid) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		return -1;
	}
	
	public static void main(String args) {
		int arr[]= {10,20,30,40,55,65,67,89,92};
		BinarySearchAlgo BSA=new BinarySearchAlgo();
		System.out.println(BSA.binarysearch(55, arr));
		
	}

}

