import java.util.*;


class linkedlist{
	public static void main(String[] args){
		int a[];
		int i,j=0;
		int key;
		int b;
		a= new int[10];
		Scanner sc= new Scanner(System.in);
		node currentnode=null;
		node previousnode=null;
		node nextnode=null;
		node startnode=null;
		System.out.print("Menu:\n1.create\n2.Delete\n3.Display\n4.Exit\n");
		do{
			System.out.println("Enter your choice");
			b=sc.nextInt();
			switch(b){
				case 1:
					System.out.print("Enter number of nodes:");
					int n=sc.nextInt();
					for(i=0;i<n;i++){
						System.out.print("enter data:");
						a[i]=sc.nextInt();}
					while(j<n){
						currentnode=new node();
						if(j>0){
							previousnode.next=currentnode;}
						else{
							startnode=currentnode;
						}
						currentnode.data=a[j];
						currentnode.next=null;
						currentnode.previous=previousnode;
						j++;
						previousnode=currentnode;}
					System.out.println("Linkedlist created");
					break;
				case 2:
					System.out.print("enter key:");
					key=sc.nextInt();
					currentnode=startnode;
					if(startnode.data==key){
						startnode=startnode.next;
						startnode.previous=null;}
					else{
						while(currentnode.next!=null){
							if(currentnode.data==key){
								previousnode=currentnode.previous;
								nextnode=currentnode.next;
								previousnode.next=nextnode;
								nextnode.previous=previousnode;
								System.out.println("node deleted");
								break;}
					
							
							else{
								currentnode=currentnode.next;}
						}
					}
				case 3:
					System.out.println("displaying linkedlist");
					currentnode=startnode;
					while(currentnode!=null){
						System.out.println(currentnode.data);
						currentnode=currentnode.next;}
				
			}
		}while(b!=4);
	}
}
