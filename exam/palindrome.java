import java.util.*;

class palindrome{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("input the String :");

        String original = sc.nextLine();

        original=original.toLowerCase();

        String reverse ="";

        for(int i=0 ; i< original.length() ; i++){
            reverse=original.charAt(i)+reverse;
        }
         
        if(original.equals(reverse)){
            System.out.print(reverse + " is palindrome" );
        }else{
            System.out.print(reverse + " is not palindrome" );
        }


        


    }
}