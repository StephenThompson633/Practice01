public class Exercise01 {

	public static void main(String[] args) {
		//Stephenbkkbk
		// Test bytes
		byte a = 010;
		byte b = 101;

		// "Add" function
		byte sum = add(a, b);
		System.out.println("This sum of bytes a and b is: " + sum);

	}

	static int add(byte a, byte b) {
		return (byte)(a + b);
	}

}
