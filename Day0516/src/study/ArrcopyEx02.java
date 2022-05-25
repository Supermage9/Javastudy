package study;

public class ArrcopyEx02 {

	public static void main(String[] args) {
		
		int[]arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		System.out.println("변경 전 arr.length :"+arr.length);
		
		int[] temp = new int[arr.length*2];
		System.out.println("temp.length :"+temp.length);
		
		
		for(int i=0;i<arr.length;i++) { // for문을 활용한 복사
			temp[i]=arr[i];
			System.out.print(temp[i]+"  ");
		}
		
		
		arr=temp;
		
		
		System.out.println();
		System.out.println("변경 후 arr.length :"+arr.length);
		
		for(int i=0;i<arr.length;i++) { 
			
			System.out.print(arr[i]+"  ");
		}
		
		
	}

}
