package CS311;
import java.util.*;


class Queue<T> {

	int front = -1, rear = -1;
	private LinkedList<T> list = new LinkedList<T>();
    ArrayList<T> A = new ArrayList<>();
 
    T front()
    {
        if (front == -1)
 
            return null;
        return A.get(front);
    }
    T rear()
    {
        if (rear == -1)
            return null;
        return A.get(rear);
    }
    void enqueue(T X)
    {
        if (this.empty()) {
            front = 0;
            rear = 0;
            A.add(X);
        }
 
        else {
            front++;
            if (A.size() > front) {
 
                A.set(front, X);
            }
            else
 
                A.add(X);
        }
    }
	
	private boolean empty() {
		if (front == -1 && rear == -1)
            return true;
		return false;
	}
	public int size() {
		ArrayList<T> list = A;
		return list.size();
	}
	public boolean hasItems() {
	    return !A.isEmpty();
	  }

//	public static void peek() {
//		int pee = list.peek();
//		System.out.println("хамгийн эхний element бол " +pee);
//	}

//		public static int view() {
//		return list1;
//	}
		public T poll() {
			T a = ((Deque<T>) A).poll();
			return a;
		}
}
public class lab_1{
	
    public static void main(String args[]) {
    
    	Scanner sc = new Scanner(System.in);
    	Queue<Integer> list = new Queue<>();
		 
		 list.enqueue(7);
		 list.enqueue(6);
		 list.enqueue(5);
		 list.enqueue(4);
		 list.enqueue(3);
		 System.out.println("өгнө тоонууд " +list);
		 System.out.println("1. max\n 2. remove\n3. add\n4. peek\n5. poll\n6. view\n");
		 int output = sc.nextInt();
		 
		try {
			while(output != 0) {
				int index;
				 
				 switch(output) {
				 case 1:
					 System.out.println(list.size());
					 break;
				 case 2:
					 System.out.println(list.hasItems());
					 break;
				 case 3:
					 System.out.println("та хэдийн тоо оруулах вэ?");
					 int a = sc.nextInt();
						 list.enqueue(a);
					 System.out.println(list);
					 break;
				 case 4:
//					 
					 break;
				 case 5:
					 System.out.println(list.poll()); 
					 break;
				 case 6:
//					 System.out.println(list.view()); 
					 break;
				 case 9: 
					 System.out.println("сонголтууд:\n" + "1.max\n2. remove\n3. add\n4. peek\n5. poll\n6. view\n");
					 System.out.println("\n таны сонголт: !!");
					 System.out.println("\n таны сонголт: !xaxa");
				 default:
				 }
				 System.out.println("сонголтуудыг сонгохоор бол 9-ийг өгнө үү?");
				 System.out.println("программыг дуусгах бол 0-ийг өгнө үү?");
                 output = sc.nextInt();
			}
            System.out.println("System ends:");
            sc.close();
		}catch(Exception e) {
            System.out.println("oroltond aldaa garlaa"+e);
            main(args);
        }
		  
    }
}