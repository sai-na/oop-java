import java.util.*;

class node{
	int data;
	node next;
	node previous;
}

class doubly{
	public static void main(String[] args){
		int arr[], index = 0, i, n;
		arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		node current_node = null;
		node previous_node = null;
		node next_node = null;
		node end_node = null;
		node start_node = null;
		
		System.out.println("Creating doubly linked list\n\nEnter the number of elements for the linked list: ");
		n = sc.nextInt();
		
		System.out.println("Enter elements: ");
		
		for(i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		
		while(index < n){
			current_node = new node();
			if(index > 0){
				previous_node.next = current_node;
			}
			else{
				start_node = current_node;
			}
			// node added into end of the linked list
			current_node.data = arr[index];
			current_node.next = null;
			current_node.previous = previous_node;
			index++;
			previous_node = current_node;
		}
		
		System.out.println("\nEnter key to delete: ");
		int key = sc.nextInt();
		current_node = start_node;
		
		if(start_node.data == key){
			start_node = start_node.next;
		}
		else{
			while(current_node != null){
			
			// check if  the element is present in the linked list or not
				if(current_node.data == key){
					previous_node = current_node.previous;
					next_node = current_node.next;
					previous_node.next = next_node;
					next_node.previous = previous_node;
					System.out.println("Node deleted");
					break;
				}
				else{
					current_node = current_node.next;
				}
			}
			System.out.println("Displaying linked lists: \n");
			current_node = start_node;
			while(current_node != null){
				System.out.println(current_node.data);
				current_node = current_node.next;
			}
		}
	}
}
