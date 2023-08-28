class SwapNumber{

	public static void main(String[] args){
	int x ,y;
	x = 5;
	y = 6;
	System.out.println("Before Swapping: "+x+ " "+ y);
	
	x = x + y;  
  	y = x - y;  
  	x = x - y;  
	System.out.println("After Swapping: "+x+ " "+ y);
}	
}