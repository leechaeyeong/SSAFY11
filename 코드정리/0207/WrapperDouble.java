public class WrapperDouble {

	public static void main(String[] args) {
		System.out.println("Double.MAX_VALUE : " + Double.MAX_VALUE);
		System.out.println("Double.MIN_VALUE : " + Double.MIN_VALUE);
		System.out.println("Double.SIZE : " + Double.SIZE);
		Double wrapperDouble = new Double(1.123456789);
		System.out.println("wrapperDouble.byteValue() : " + wrapperDouble.byteValue());
		System.out.println("wrapperDouble.shortValue() : " + wrapperDouble.shortValue());
		System.out.println("wrapperDouble.intValue() : " + wrapperDouble.intValue());
		System.out.println("wrapperDouble.longValue() : " + wrapperDouble.longValue());
		System.out.println("wrapperDouble.floatValue() : " + wrapperDouble.floatValue());
		System.out.println("wrapperDouble.doubleValue() : " + wrapperDouble.doubleValue());

		System.out.println("Float.MAX_VALUE : " + Float.MAX_VALUE);
		System.out.println("Float.MIN_VALUE : " + Float.MIN_VALUE);
		System.out.println("Float.SIZE : " + Float.SIZE);
		Float wrapperFloat = new Float(3.14F);
		System.out.println("wrapperFloat.floatValue() : " + wrapperFloat.floatValue());
	}

}
