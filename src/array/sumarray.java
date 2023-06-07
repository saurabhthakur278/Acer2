package array;

public class sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,2,3,4,5};
	add(arr);
	}
	
	public static void add(int[] arr) {
	int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
	System.out.println(sum);
	}
	

}
