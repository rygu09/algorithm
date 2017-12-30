package sort;

public class Merge_Sort {
	
	public static void main(String[] args) {
		int[] arr={5,2,8,9,1,3,4};
		sort(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

	/**
	 * 归并排序
	 * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列
	 * 时间复杂度为O(nlogn)
	 * 稳定排序方式	
	 */
	
	public static int[] sort(int[] nums, int low, int high) {
	    int mid = (low + high) / 2;
	    if (low < high) {
	        // 左边
	        sort(nums, low, mid);
	        // 右边
	        sort(nums, mid + 1, high);
	        // 左右归并
	        merge(nums, low, mid, high);
	    }
	    return nums;
	}

	/**
	 * 将数组中low到high位置的数进行排序
	 */
	public static void merge(int[] nums, int low, int mid, int high) {
	    int[] temp = new int[high - low + 1];
	    int i = low;// 左指针
	    int j = mid + 1;// 右指针
	    int k = 0;

	    // 把较小的数先移到新数组中
	    // 注意等于号
	    while (i <= mid && j <= high) {
	        if (nums[i] < nums[j]) {
	            temp[k++] = nums[i++];
	        } else {
	            temp[k++] = nums[j++];
	        }
	    }

	    // 把左边剩余的数移入数组
	    while (i <= mid) {
	        temp[k++] = nums[i++];
	    }

	    // 把右边边剩余的数移入数组
	    while (j <= high) {
	        temp[k++] = nums[j++];
	    }

	    // 把新数组中的数覆盖nums数组
	    // 注意nums[k2+low]
	    for (int k2 = 0; k2 < temp.length; k2++) {
	        nums[k2 + low] = temp[k2];
	    }
	}
	
}
