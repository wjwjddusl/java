class Ex2_8 {
	public static void main(String args[]) {
		
		int a =10, b=15;
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("After changing");
		
		int tmp = a; //a -> tmp
	    a = b; //b -> a 
		b = tmp; //tmp(=a) -> b
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
	}
}