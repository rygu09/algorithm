package search;

public class binarysearch {
	public static void main(String[] args) {
		int[] arr={1,3,4,7,9,12,18};
		int position=binarySearch(arr,7,0,arr.length-1);
		System.out.println(position);
	}
	/**
	 * 二分查找特定整数在整型数组中的位置(递归)   
	 * @param dataset
	 * @param data
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	 public static int binarySearch(int[] dataset,int data,int beginIndex,int endIndex){    
	       int midIndex = (beginIndex+endIndex)/2;    
	       if(data <dataset[beginIndex]||data>dataset[endIndex]||beginIndex>endIndex){  
	           return -1;    
	       }  
	       if(data <dataset[midIndex]){    
	           return binarySearch(dataset,data,beginIndex,midIndex-1);    
	       }else if(data>dataset[midIndex]){    
	           return binarySearch(dataset,data,midIndex+1,endIndex);    
	       }else {    
	           return midIndex;    
	       }    
	   }   
	 /**
	  * 二分查找特定整数在整型数组中的位置(非递归)
	  * @param srcArray
	  * @param des
	  * @return
	  */
	 public static int binarySearch(int[] srcArray, int des){   
	      
	        int low = 0;   
	        int high = srcArray.length-1;   
	        while(low <= high) {   
	            int middle = (low + high)/2;   
	            if(des == srcArray[middle]) {   
	                return middle;   
	            }else if(des <srcArray[middle]) {   
	                high = middle - 1;   
	            }else {   
	                low = middle + 1;   
	            }  
	        }  
	        return -1;  
	   }  

}
