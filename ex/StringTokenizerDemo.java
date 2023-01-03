import java.util.*;

 class StringTokenizerDemo{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		int sum = 0;
		
		System.out.println("Input the data with space ");
		s =sc.nextLine();
		System.out.print("\n");
		
		StringTokenizer st = new StringTokenizer(s , " ");
		while(st.hasMoreTokens()){
		String i = st.nextToken();
		int j  = Integer.parseInt(i);
		sum += j ;
		System.out.print(j + " " );
		
		}
		
			System.out.print(" sum is " + sum );
		

	} 

}
