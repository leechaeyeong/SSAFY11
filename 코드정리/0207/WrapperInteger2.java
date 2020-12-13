public class WrapperInteger2 {

// Byte Short Integer Long Float Double 모두 다음의 method를 가지고 있음
// byteValue(),shortValue(),intValue(),longValue(),floatValue(),doubleValue()
	public static void main(String[] args) {
		System.out.println("Byte.MAX_VALUE : " + Byte.MAX_VALUE);
		System.out.println("Byte.MIN_VALUE : " + Byte.MIN_VALUE);
		System.out.println("Byte.SIZE : " + Byte.SIZE);
		Byte wrapperByte = new Byte((byte) 127);
		System.out.println("wrapperByte.byteValue() : " + wrapperByte.byteValue());

		System.out.println("Short.MAX_VALUE : " + Short.MAX_VALUE);
		System.out.println("Short.MIN_VALUE : " + Short.MIN_VALUE);
		System.out.println("Short.SIZE : " + Short.SIZE);
		Short wrapperShort = new Short((short) 32000);
		System.out.println("wrapperShort.shortValue() : " + wrapperShort.shortValue());

		System.out.println("Long.MAX_VALUE : " + Long.MAX_VALUE);
		System.out.println("Long.MIN_VALUE : " + Long.MIN_VALUE);
		System.out.println("Long.SIZE : " + Long.SIZE);
		Long wrapperLong = new Long(922L);
		System.out.println("wrapperLong.longValue() : " + wrapperLong.longValue());
	}

}
