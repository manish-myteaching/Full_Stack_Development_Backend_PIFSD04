package datatype;

public class PrimitiveDTDemo {
	public static void main(String[] args) {
		byte a = 124;
		short s = 32767;
		int i = 10;
		long l = 20;

		float f = 10.100212664f;
		double d = 10.20555555554545454;
		char c = '\u0000';
		boolean b = false;

		System.out.println("Byte: " + a);
		System.out.println("Short: " + s);
		System.out.println("Integer: " + i);
		System.out.println("Long: " + l);
		System.out.println("Float: " + f);
		System.out.println("Double:" + d);

		System.out.println(Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + " - " + Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " - " + Long.MAX_VALUE);

		System.out.println(Float.MIN_VALUE + " - " + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + " - " + Double.MAX_VALUE);

		System.out.println("Char " + c);
		System.out.println("Boolean " +"\n"+b);

	}

}
