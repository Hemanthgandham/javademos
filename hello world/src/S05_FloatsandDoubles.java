
public class S05_FloatsandDoubles {
	public static void main(String[] args) {
		System.out.println("min float value: "+ Float.MIN_VALUE);
		System.out.println("max float value: "+ Float.MAX_VALUE);
		
		System.out.println("min double value: "+ Double.MIN_VALUE);
		System.out.println("max double value: "+ Double.MAX_VALUE);
		
		int val = 5;
		float val2 = 5.25f;
		double val3 = 5.26d;
		
		
		val = 6;
	    val2 = 6f;
	    val3 = 6d;
	    System.out.println(val);
	    System.out.println(val2);
	    System.out.println(val3);
	    
	    int intval = 7/2;
	    System.out.println(intval);
	    
	    float floatval = 7f/2f;
	    System.out.println(floatval);
	    
	    double dval = 7d/2d;
	    System.out.println(dval);
	    
	    System.out.println("intval: " + intval + ",floatval: " + floatval+ ",dval: " + dval );
	    
	}

}
