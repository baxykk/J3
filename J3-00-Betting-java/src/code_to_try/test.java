package Test;

public class test {
	public static void m(String... s) {
		for (String st:s) System.out.println(st);
	}
	
	public static String generateString(String... values) {
		String cols="", vals="";
				for (int i = 0; i < values.length; i++) {
					if (i == values.length - 1) {
						cols += values[i];
						vals += "?";
					}
					else {
						cols += values[i]+", ";
						vals += "?, ";
					}
				}
		return "("+ cols + ") values(" + vals+ ")";
	}
	
	public static void main(String[] args) {
		System.out.println(generateString("a", "b"));		
	}
}
