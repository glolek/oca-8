public class Primitives {
	public static void main(String... args) {
		long max1 = 2123456789; // 3123456789 doesn't complie because of no L at the end
		long max2 = 3_123_456_789L;
		
		System.out.println("INTEGER MIN: " + Integer.MIN_VALUE);
		System.out.println("INTEGER MAX: " + Integer.MAX_VALUE);
		
	}
}