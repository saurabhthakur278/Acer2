package array;



class Student{
	public int rollNo;
	String name;
	
	
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
}

public class decleare {

	 public static void main (String[] args) {
		 
		 
		 
//		 int[] arr;
//		 
//		 arr=new int[5];
//		 
//		 arr[0]=10;
//		 arr[1]=20;
//		 arr[2]=30;
//		 arr[3]=40;
//		 arr[4]=50;
//		 
//		 for(int i=0;i<arr.length;i++) {
//			 System.out.println(i+" "+ arr[i]);
//		 }
			 
		 
		 Student[] arr;
		 
		 arr=new Student[5];
		 
		 
		 arr[0]=new Student(1,"saurabh");
		 
		 arr[1]=new Student(2,"asd");
		 arr[2]=new Student(3,"eeeeeabh");
		 arr[3]=new Student(4,"rrrrrbh");
		 arr[4]=new Student(5,"ttttttbh");
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i].rollNo +"  "+arr[i].name);
			 
			
			 
		 }
		 
}
}