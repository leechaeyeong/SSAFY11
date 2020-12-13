
public class PrintfTest {

	public static void main(String[] args) {

		System.out.print(111);//line new X.

		System.out.println();//line new

		System.out.printf("boolean %b",true);

		System.out.printf("%n");//line new
		System.out.printf("char %c",'X');

		System.out.printf("%n");
		System.out.printf("String %s","hello");

		System.out.printf("%n");
		System.out.printf("10진수 실수 %f",99.9);

		System.out.printf("%n");
		System.out.printf("10진수 실수, 7자리 확보, 소수점 2자리. [%7.2f]",3.14999);

		System.out.printf("%n");
		System.out.printf("10진수 정수 %d",777);

//		System.out.printf("%n");
//		System.out.printf("8진수 정수 %o",777);
//		System.out.printf("%n");
//		System.out.printf("16진수 정수 %x",777);

		System.out.printf("%n");
		System.out.printf("10자리 확보, 오른쪽 정렬. [%10d]",77);
		System.out.printf("%n");
		System.out.printf("10자리 확보, 왼쪽 정렬. [%-10d]",77);
		System.out.printf("%n");
		System.out.printf("10자리 확보, 오른쪽 정렬, 0채움. [%010d]",77);

		System.out.printf("%n");
		System.out.printf("%s : %f + %f = %d","Result", 3.3, 2.2, (int)(3.3+2.2));
	}

}
