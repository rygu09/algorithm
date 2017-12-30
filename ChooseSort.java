package sort;
//简单选择排序
//选择排序类
//时间复杂度O(n^2)
//每次排序找到最小索引，再交换位置
//第一趟，从n 个记录中找出关键码最小的记录与第一个记录交换；
//第二趟，从第二个记录开始的n-1 个记录中再选出关键码最小的记录与第二个记录交换；
//以此类推.....
//第i 趟，则从第i 个记录开始的n-i+1 个记录中选出关键码最小的记录与第i 个记录交换，
//直到整个序列按关键码有序
public class ChooseSort {
	public static void main(String[] args) {
		int[] arr={1,5,2,4,9};
		sort(arr);
		for(int a:arr)
			System.out.println(a);
	}

	private static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
			
	}

}
