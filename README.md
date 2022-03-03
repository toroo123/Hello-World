package CS311;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.awt.List;
import java.util.*;


public class lab_1 {

	static Scanner sc = new Scanner(System.in);
	static Queue<Integer> list = new LinkedList<>();
	
	public static void max() {
		Object a = new Object();
		a= ((LinkedList<Integer>) list).get(0);
		
		for(int i=1; i<list.size(); i++)
			if((int)a<(int) ((LinkedList<Integer>) list).get(i)) {
				a = ((LinkedList<Integer>) list).get(i);
			}
		System.out.println("max: " + a);
	}
	public static void remove(int rem) {
		for(int i=0;i<list.size();i++) {
			int a1 = ((LinkedList<Integer>) list).get(i);
			if(a1 == rem) {
				boolean removedele = list.remove(a1);
			}
		}
		 
	        System.out.println(list);
	}
	
	
    public static void main(String args[]) {
    
    	System.out.println("та тоонуудаа оруулж өгнө үү?");
    	System.out.println("оруулж дууссан бол 0-ийн тоог өгч дуусгана уу.");
		 int input = sc.nextInt();
		 while(input != 0) {
			 list.add(input);
			 input = sc.nextInt();
		 }
		 
		 System.out.println("өгнө тоонууд " +list);

		 System.out.println("1. max\n 2. remove\n3. add\n");
		 int output = sc.nextInt();
		 
		try {
			while(output != 0) {
				int index;
				 
				 switch(output) {
				 case 1:
					 max();
					 break;
				 case 2:
					 System.out.println("тоогоо оруулна уу?");
					 int rv = sc.nextInt();
					 remove(rv);
					 break;
				 case 3:
					 System.out.println("та хэдэн тоо оруулах вэ?");
					 int a = sc.nextInt();
					 System.out.println("тоонуудаа оруулна уу?");
					 for(int i=0;i<a;i++) {
						 int adds = sc.nextInt();
						 list.add(adds);
					 }
					 System.out.println(list);
					 break;
				 case 9: 
					
                 	 default:
				 }
				 System.out.println("сонголтууд:\n" + "1.max\n2. remove\n3. add\n");
				 System.out.println("сонголтуудыг хархаар бол 9-ийг өгнө үү?");
                 System.out.println("\n таны сонголт: ");
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

