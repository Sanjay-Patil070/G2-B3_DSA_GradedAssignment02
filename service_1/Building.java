package service_1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Building {

	public void inputSize() {

		//import scanner class to give user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the toatl number of floors in building");
		int size=sc.nextInt();

		//create array to take different size of floor
		int[] arr=new int[size];

		//fill entire size of array using for loop
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the floor size"+" "+(i+1));
			arr[i]=sc.nextInt();
		}
		sc.close();

		//create construction method to write logic in that method
		construction(arr,size);
	}

	private void construction(int[] arr, int size) {
		//import priority queue because it is most suitable for this problem 
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Collections.reverseOrder());
		System.out.println("Construction order is as follows\n");
		int floor=size;
		for (int i = 0; i <size; i++) {
			System.out.println("construction on day"+" "+(i+1));

			//fill the array element into queue
			queue.add(arr[i]);
			//check whether queue is empty or not
			while (!queue.isEmpty()) {
				if(floor==queue.peek()) {
					System.out.print(floor+" ");

					//decrease the floor size gradually
					floor--;

					//remove element from queue to add next floor size as it is one by one operation
					queue.remove();
				}
				else {
					break;
				}	
			}
			System.out.println();
		}
	}

}
