/*
 * Reference Data Type (class형/java object 형 Data Type)
 * Wrapper Class란?
 * - java primitive data type을 객체로 접근 가능하게 만든 class
 * - 손 쉬운 Data Type Casting을 가능하게 함
 * 정수형 Wrapper Class - Byte, Short, Integer, Long
 * 실수형 Wrapper Class - Float, Double
 * 문자형 Wrapper Class - Character
 * 논리형 Wrapper Class - Boolean
 */
public class WrapperInteger {

	public static void main(String[] args) {
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("Integer.SIZE : " + Integer.SIZE);
		Integer wrapperInt = new Integer(777);
		byte byteVar = wrapperInt.byteValue();
		short shortVar = wrapperInt.shortValue();
		int intVar = wrapperInt.intValue();
		long longVar = wrapperInt.longValue();
		float floatVar = wrapperInt.floatValue();
		double doubleVar = wrapperInt.doubleValue();
		System.out.println("byteVar : " + byteVar);
		System.out.println("shortVar : " + shortVar);
		System.out.println("intVar : " + intVar);
		System.out.println("longVar : " + longVar);
		System.out.println("floatVar : " + floatVar);
		System.out.println("doubleVar : " + doubleVar);
	}

}
