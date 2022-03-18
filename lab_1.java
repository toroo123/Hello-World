package CS311;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import java.awt.List;
import java.util.*;

class GenQueue<E> {

	private Queue<E> list = new LinkedList<E>();
	
	public Queue<E> add(E num) {
		((LinkedList<E>) list).add(num);
		return list;
	}
	public String max() {
		Object a = new Object();
		a= ((LinkedList<E>) list).get(0);
		
		for(int i=1; i<list.size(); i++)
			if((int)a<(int) ((LinkedList<Integer>) list).get(i)) {
				a = ((LinkedList<Integer>) list).get(i);
			}
		return ("max: " + a);
	}
	public Queue<E> remove() {
				E removedele = list.remove();
				return list;
	}
	public int peek() {
		int pee = (int) list.peek();
		return pee;
	}
	public int poll() {
		return (int) list.poll();
	}
	public char[] view() {
		char[] list = null ;
		return list;
	}
	
public class lab_1 {
		public void main(String args[]) {
    	
    	Scanner sc = new Scanner(System.in);
    	
		 System.out.println("өгнө тоонууд " +list);

		 System.out.println("1. max\n 2. remove\n3. add\n4. peek\n5. poll\n6. view\n");
		 int output = sc.nextInt();
		 
		try {
			while(output != 0) {
				int index;
				 
				 switch(output) {
				 case 0:
					 E num = (E) sc.next();
					 add(num);
					 break;
				 case 1:
					 max();
					 break;
				 case 2:
					 remove();
					 break;
				 case 3:
					 System.out.println("та хэдийн тоо оруулах вэ?");
					 E a = (E) sc.next();
						 list.add(a);
					 System.out.println(list);
					 break;
				 case 4:
					 peek();
					 break;
				 case 5:
					 poll();
					 break;
				 case 6:
					 //view();
					 break;
				 case 9: 
					 System.out.println("сонголтууд:\n" + "1.max\n2. remove\n3. add\n4. peek\n5. poll\n6. view\n");
					 System.out.println("\n таны сонголт: ");
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

}
 class Employee {
	  public Integer number;

	  public Employee() {
	  }

	  public Employee(Integer num) {
	    this.number = num;
	  }

	  public Integer toInteger() {
	    return number;
	  }
	}
