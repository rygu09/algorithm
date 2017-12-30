/** 希尔排序
 *  属于插入排序类
 *  时间复杂度O(nlogn)	
 */
package sort;

public class Shell_Sort {
	
	public static void main(String[] args) {
		int[] arr={5,2,8,9,1,3,4};
		shell(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

	/**希尔排序的原理:比如从小到大排列，它会首先将数组进行分组，然后将较小值移到前面，较大值
	 * 移到后面，最后将整个数组进行插入排序，这样比起一开始就用插入排序减少了数据交换和移动的次数，可以说希尔排序是加强
	 * 版的插入排序
	 * 拿数组5, 2, 8, 9, 1, 3，4来说，数组长度为7，当increment为3时，数组分为两个序列
	 * 5，2，8和9，1，3，4，第一次排序，9和5比较，1和2比较，3和8比较，4和比其下标值小increment的数组值相比较
	 * 此例子是按照从小到大排列，所以小的会排在前面
	 * 第一次排序后数组为 5, 1, 3, 9, 2, 8, 4 ———> 5, 1, 3, 9, 2, 8, 9————>5, 1, 3, 5, 2, 8, 9————>4, 1, 3, 5, 2, 8, 9
	 * 看4的位置变化，基数个时，第几个（下标）7和下标为7-3，7-6的比
	 * 第一次后increment的值变为3/2=1,此时相当于对数组进行插入排序
	 * 实现数组从小到大排列
	 */	
	private static void shellSort(int[] arr) {
		int j=0;
		int size=arr.length;
		//第一次步长为数组长度的一半，从中间开始，和隔一半的前面数比较
		//第二层循环控制比较次数
		//第三层循环比较并交换位置
		for(int increatment=size/2;increatment>0;increatment/=2){			
			for(int i=increatment;i<size;i++){				
				int temp=arr[i];
				for(j=i;j>=increatment && temp< arr[j-increatment];j-=increatment){
					arr[j]=arr[j-increatment];
				}
				arr[j]=temp;
			}
			
		}
	}

}
