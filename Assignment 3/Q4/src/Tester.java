import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("0.EXIT \n1.PUSH \n2.POP \n3.PEEK");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Thank You......");
				System.exit(0);
				break;
				
			case 1:
				System.out.println("Enter element to push: ");
				int value = sc.nextInt();
				if(q.isFull())
					System.out.println("Queue is full.");
				else {
					q.push(value);
				}
				break;
				
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is empty.");
				else {
					System.out.println("pop element: " + q.pop());
				}
				break;
				
			case 3:
				if(q.isEmpty())
					System.out.println("Queue is empty.");
				else
					System.out.println("Peek element: " + q.peek());
				break;
			}
		}
	}
}
