/** 快排
 *  属于交换排序类
 *  时间复杂度O(nlogn)
 */

package sort;

public class Quicksort {
	
	public static void main(String[] args) {
		int[] arr={3,1,5,7,2,4,9,6,10,8};
		quickSort(arr,0,arr.length-1);
		for(int i:arr)
			System.out.println(i);
	}
	
	public static void quickSort(int A[], int begin,int end){
		if(begin<end){
			int q= partition(A,begin, end);
			quickSort(A,begin, q-1);
			quickSort(A,q+1,end);
		}     
	}
    public static int partition(int arr[], int low, int high){     //划分
        int pivot=arr[low];  //pivot中枢
    	while(low<high){
        	  while(low<high && arr[high]>=pivot)
        		  high--; //从后往前，比中枢大，则跳过
        	  arr[low]=arr[high];
        	  while(low<high && arr[low]<=pivot)
        		  low++;  //从前往后，比中枢小，则跳过
        	  arr[high]=arr[low];
          }
    	arr[low]=pivot;
         return low;
   }    
}
