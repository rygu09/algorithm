package suibian2;

public class Bubble_Sort {
	
	public static void main(String[] args) {
		int[] arr={1,5,2,4,9};
		bubblesort(arr);
		for(int a:arr)
			System.out.println(a);
	}

	private static void bubblesort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length-i-1;j++){
				while(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
