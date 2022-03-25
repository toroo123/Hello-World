package CS311;
import java.io.*;
import java.util.*;
import java.util.LinkedList;


class Queue<T> {

	int front = -1, rear = -1;
    ArrayList<T> A = new ArrayList<>();
    
//    T front()
//    {
//        if (front == -1) {
//        	   return null;	
//        }
//        return A.get(front);
//    }
//    T rear()
//    {
//        if (rear == -1) {
//        	   return null;	
//        }
//        return A.get(rear);
//    }
    
   
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
            }else
                A.add(X);
        }
    }
	
	public boolean empty() {
		if (front == -1 && rear == -1) {
		   return true;	
		}
		return false;
	}
	public int size() {
		ArrayList<T> list = A;
		return list.size();
	}
    
		public T poll() {
			T a = ((Deque<T>) A).poll();
			return a;
		}

		void dequeue()
	    {
	        if (this.empty()) {
	        	System.out.println("Queue is already empty");	
	        }
	        else if (front == rear) {
	            front = -1;
	            rear = -1;
	        }
	        else {
	            rear++;
	        }
	    }
		
		public String toString()
		{
			if (this.empty()) {
				return "";
			}
			String Ans = "";
			for (int i = rear; i < front; i++) {
				Ans += String.valueOf(A.get(i)) + "->";
			}

			Ans += String.valueOf(A.get(front));

			return Ans;
		}
}
public class lab_1{
	
    public static void main(String args[]) {
    
    	Scanner sc = new Scanner(System.in);
    	Queue<Integer> list = new Queue<>();
		 
		 list.enqueue(7);
		 list.enqueue(6);
		 list.enqueue(5);
		 System.out.println("1. size\n 2. empty\n3. add\n4. remove\n5. poll\n6. view\n");
		 int output = sc.nextInt();
		 
		try {
			while(output != 0) {
				int index;
				 
				 switch(output) {
				 case 1:
					 System.out.println(list.size());
					 break;
				 case 2:
					 System.out.println(list.empty());
					 break;
				 case 3:
					 System.out.println("та хэдийн тоо оруулах вэ?");
					 int a = sc.nextInt();
					 list.enqueue(a);
					 break;
				 case 4:
					 list.dequeue();
					 System.out.println(list.toString()); 
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