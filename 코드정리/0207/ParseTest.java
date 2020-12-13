/*
 * 숫자 형태의 문자열에서 숫자 값 추출하기
 * - Wrapper Class의 parse method 사용
 * Byte.parseByte
 * Short.parseShort
 * Integer.parseInt
 * Long.parseLong
 * Float.parseFloat
 * Double.parseDouble
 */
public class ParseTest {

	public static void main(String[] args) {
		String str1 = "127";
		//int intVar1 = 100 + str1;//error
		byte byteVar = Byte.parseByte(str1);
		short shortVar = Short.parseShort(str1);
		int intVar2 = Integer.parseInt(str1);
		long longVar = Long.parseLong(str1);
		System.out.println("byteVar : " + byteVar);
		System.out.println("shortVar : " + shortVar);
		System.out.println("intVar2 : " + intVar2);
		System.out.println("longVar : " + longVar);
		int intVar3 = 100 + intVar2;
		System.out.println("intVar3 : " + intVar3);
		String str2 = "99.9";
		float floatVar = Float.parseFloat(str2);
		double doubleVar = Double.parseDouble(str2);
		System.out.println("floatVar : " + floatVar);
		System.out.println("doubleVar : " + doubleVar);
	}

}
