public class GarbageCollectorDemo {
	public void finalize(){System.out.println("object is garbage collected");}  
	public static void main(String args[]){  
		GarbageCollectorDemo s1=new GarbageCollectorDemo();  
		GarbageCollectorDemo s2=new GarbageCollectorDemo();  		
		s1=null;  
		s2=null;  
		System.gc();  
	}  
}
