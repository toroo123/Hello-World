package dome;
import java.util.*;


class Queue<T> {

	int front = -1, rear = -1;
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

		public T poll() {
			T a = ((Deque<T>) A).poll();
			return a;
		}

		void dequeue() {
			if(this.empty()) {
				System.out.println("queue хоосон байна");
			}else if (front == rear) {
				front=rear=-1;
			}else {
				rear++;
			}
		}
}
public class dome_1{
	
    public static void main(String args[]) {
    
    	Scanner sc = new Scanner(System.in);
    	Queue<Integer> list = new Queue<>();
		 
		 list.enqueue(7);
		 list.enqueue(6);
		 list.enqueue(5);
		 list.enqueue(4);
		 list.enqueue(3);
		 System.out.println("өгнө тоонууд " +list);
		 System.out.println("1. size\n 2. hasItems\n3. add\n4. remove\n5. poll\n6. view\n");
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
					 System.out.println(list.A);
					 break;
				 case 4:
					 list.dequeue();
					 break;
				 case 5:
					 System.out.println(list.poll()); 
					 break;
				 case 6:
					 System.out.println(list.A); 
					 break;
				 case 9: 
					 System.out.println("сонголтууд:\n" + "1. size\\n 2. hasItems\\n3. add\\n4. remove\\n5. poll\\n6. view\\n");
					 System.out.println("\n таны сонголт: !!");
					 System.out.println("\n таны сонголт: !xaxa");
				 default:
				 }
				 System.out.println("сонголтуудыг хархаар бол 9-ийг өгнө үү?");
				 System.out.println("программыг дуусгах бол 0-ийг өгнө үү?");
                 output = sc.nextInt();
			}
            System.out.println("System ends:");
            sc.close();
		}catch(Exception e) {
            System.out.println("input aldaa garlaa"+e);
            main(args);
        }
		  
    }
}