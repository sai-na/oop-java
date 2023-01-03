import java.util.*;

class frequency{

public static void main(String agrs[]){

	int frq= 0;
	String s= "";
	char ch;
	
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter the String");
	s= sn.nextLine();
	
	System.out.println("Enter the Char");
	ch= sn.next().charAt(0);
	
	for(int i =0 ; i <=(s.length()-1); i++){
	if(ch==s.charAt(i))frq++;
	}
	
	System.out.println("Frequency of character is " + frq);
	
} 
} 
