
public class S08_StringMethods {
	public static void main(String[] args) {
		
		String s = "Hello world";
		System.out.println(s);
				
	    System.out.println(s.length());
		System.out.println("index of w = "+ s.indexOf('w'));
		
		//print the character at position 3
		
		System.out.println("character at  3 = " +s.charAt(3));
		// System.out.println("character at 12 = "+s.charAt(12));
		
		
		System.out.println("command after exception");
		System.out.println("index of l = "+s.indexOf('l'));
		System.out.println("index of second l = "+s.indexOf('l',3));
		System.out.println("index of third l = "+s.indexOf('l',4));
		
		System.out.println("substring: "+ s.substring(5));
		
		String[] s2 = s.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		String[] s3 = s.split("o");
		System.out.println("no of derived words: "+ s3.length);
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		System.out.println(s3[2]);
		
		System.out.println("index of space: "+s.indexOf(" "));
		
		System.out.println("replaced: "+s.replace("H","P"));
		
		System.out.println("uppercase: "+s.toUpperCase());
		System.out.println("lowercase: "+s.toLowerCase());
		
	}

}
