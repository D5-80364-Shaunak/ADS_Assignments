//2. Create an array of integers. Reverse the array using stack

public class Tester {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		Stack st = new Stack(5);
		for(int i=0;i<5;i++) {
			st.push(arr[i]);
		}
		
		for(int i=0;i<5;i++) {
			arr[i] = st.peek();
			st.pop();
		}
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
