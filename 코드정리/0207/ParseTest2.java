public class ParseTest2 {

	public static void main(String[] args) {
		String str1 = "yeah777yeah";
		//System.out.println(Integer.parseInt(str1));//error
		//String class의  method를 사용하여, str1에서 777 값을 분리하고,
		//더하기 111 을 수행하여, 출력하라
		int beginIndex = str1.indexOf('7');
		int endIndex = str1.lastIndexOf('7');
		String tempStr = str1.substring(beginIndex, endIndex + 1);
		System.out.println("tempStr : " + tempStr);
		int intVar = Integer.parseInt(tempStr);
		System.out.println("111 + intVar = " + (111 + intVar));
	}

}
