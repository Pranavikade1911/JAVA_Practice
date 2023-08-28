class Swap{

	public static void main(String[] args){
	int x ,y,t;
	x = 5;
	y = 6;
	System.out.println("Before Swapping: "+x+ " "+ y);
	
	t = x;
	x =y;
	y = t;
	System.out.println("After Swapping: "+x+ " "+ y);
}	
}