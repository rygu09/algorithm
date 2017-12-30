/** 直接插入排序
 *  属于插入排序类
 *  时间复杂度O(n^2)	
 */

package sort;

public class Insert_Sort {
	
	public static void main(String[] args) {
		int[] arr={4,2,1,3};
		insert(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	/**
	 * 插入排序
	 * 先比较，再后移，最后插入
	 * 从第二个数开始 循环
	 * 和它之前的数比较，比它大的都放后面
	 * 当遇到比它小的数时退出循环
	 * 将该数插入到比它小的数的后面 
	 */

	private static void insert(int[] arr) {
		int size = arr.length;
		int temp = 0 ;
		int j =  0;

		for(int i = 1 ; i < size ; i++)
		{
		    temp = arr[i];
		    //假如temp比前面的值小，则将前面的值后移
		    for(j = i ; j > 0 && temp < arr[j-1] ; j --)
		    {
		    arr[j] = arr[j-1];
		    }
		    arr[j] = temp;
		}

		
	}

}
