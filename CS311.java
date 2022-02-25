package CS311;

import dataStructures.ArrayStack;
import java.util.*;

public class MyStack extends ArrayStack {

	public int size() {
		if(!empty()) return top+1;
		else return 0;
	}
	public Object[] toArray() {
		Object[] obj = new Object[size()];
		int i = size() - 1;
		// to array
		while(!empty()) {
			obj[i--] = pop();
		}
		// push stack again
		for(int j = 0; j < obj.length; j++) {
			push(obj[j]);
		}
		return obj;
	}
	public MyStack reverse(MyStack stack) {
		Object[] obj = new Object[stack.size()];
		
		int i = 0;
		while(!stack.empty()) {
			obj[i++] = stack.pop();
		}
		
		MyStack s = new MyStack();
		for(int j = 0; j < obj.length; j++) {
			s.push(obj[j]);
		}
		return s;
	}
	
	public String printStack() {
		Object[] arr = toArray();
		boolean first = true;
		String result = "";
		for(Object i : arr) {
			result += "\t" + i + ((first == true)? " -> bottom": "") + "\n";
			first = false;
		}
		result = result.substring(0,result.length() - 1);
		return result += " -> top";
	}
	public MyStack splitStack() {
		int mid = size() / 2 - 1;
		
		MyStack stack = new MyStack();
		for(int i = 0; i <= mid; i++) {
			stack.push(pop());
		}
		return reverse(stack);
	}
	
	public void combineStack(MyStack stack) {
		Object[] obj = stack.toArray();
		
		for( int i = 0; i < obj.length; i++) {
			push(obj[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack mystack = new MyStack();
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.push(6);
		mystack.push(1);
		mystack.push(5);
		mystack.push(6);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============================================MENU============================================");
		System.out.println("empty\npeek\npush\npop");
		System.out.println("\n\nsize\ntoArray");
		System.out.println("\n\ninputStack\nprintStack\nsplitStack\ncombineStack");
		for(;;) {
			System.out.print("\nEnter your command: ");
			String songolt = sc.next();
			
			switch(songolt) {
			case "empty": System.out.println("Is empty: " + mystack.empty()); break;
			case "peek": System.out.println("Peek element: " + mystack.peek()); break;
			case "push": {
				System.out.print("Enter push element: ");
				try {
				mystack.push(sc.nextInt());
				} 
				catch(Exception e) {
					System.out.println("push case error!");
				}
				break;
			}
			case "pop": try {System.out.println("Pop: " + mystack.pop());} catch(Exception e) {System.out.println("pop case error!");} break; 
			case "size": System.out.println("Size: " + mystack.size()); break;
			case "toArray": {Object[] array = mystack.toArray(); System.out.print("Array >> "); for(Object i : array) {System.out.print(i + " ");} break;}
			case "printStack": System.out.println(mystack.printStack()); break;	
			case "splitStack": 
				System.out.println("\n\tHuvaaj avsan stack : \n\n" + mystack.splitStack().printStack() + "\n\n\tUndsen Stack : \n\n"
						 + mystack.printStack()); break;	
			case "combineStack": 
				MyStack s = new MyStack(); 
				s.push(100);
				s.push(200);
				s.push(300);
				System.out.println(mystack.printStack() + "\n\n\t stack deer \n\n" + s.printStack() + "\n\n\t stack-g nemlee \n");
				mystack.combineStack(s);
				System.out.println(mystack.printStack()); 
				break;	

			
			case "exit": System.exit(0); sc.close(); break;
			default: System.out.println("Your command is wrong. Enter another command, please ..."); break;
			}
		}
	}

}