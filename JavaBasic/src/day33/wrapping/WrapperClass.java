package day33.wrapping;


public class WrapperClass {

	public static void main(String[] args) {
		int a=20;  
		//Converting int into Integer  
		Integer k=new Integer(a);//converting int into Integer explicitly
		Integer l=new Integer(25);//converting int into Integer explicitly
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);  
		System.out.println("***Unboxing of boxed object*****");
		//Converting Integer to int    
		Integer a1=new Integer(25);   
		int i1=a1.intValue();//converting Integer to int explicitly  
		System.out.println("a1: "+a1+"\ni1: "+i1); 
	
		System.out.println(k1);
		System.out.println("a1==i1 : "+(a1==i1));// compare address
		System.out.println("a1.equals(i1) : "+a1.equals(i1));
		System.out.println(a1.equals(l));// compare value
		System.out.println(a1);
		System.out.println(a1.toString()); // return value
	}
}
/**
 * Wrapper class is a predefined class in java belongs to java.lang package
 * its used to convert primitive type to object type 
 * 			-----> boxing operation ---> implicitly or auto-boxing
 * converting back the boxed object into primitive type is known as 
 * 			-----> un-boxing operation ---> 
 * 
 * in wrapper class toString() & equals & '==' are overrided
 */ 