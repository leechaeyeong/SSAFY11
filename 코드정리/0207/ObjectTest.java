/*
 * Object
 * - java 에서의 최 상위 부모 class
 * - java의 모든 class에 자동 상속
 * - java의 inheritace와 polymorphism의 기초 개념이 됨
 * 
 * - toString : 객체 정보를 표현
 *              package.ClaaName + @ + 16진수 hashcode
 * - hashCode : JVM이 부여하는 객체 관리 번호
 *              고유한 값으로 알려져 있으나, 반드시 고유 값을 보장하는 것은 아님
 * - getClass : 현재 객체의 class 정보를 담은 객체(java.lang.Class)를 만들어 줌
 * - equals : 객체 정보를 비교
 *            주의!!! String class의 equals와 다름!!!
 *            주의!!! 객체 비교 시에 == 금지!!!
 */
class EmptyClass { }

public class ObjectTest {

	public static void main(String[] args) {

		EmptyClass empty1 = new EmptyClass();
		EmptyClass empty2 = new EmptyClass();

		System.out.println("empty1.toString() : " + empty1.toString());
		System.out.println("empty2.toString() : " + empty2.toString());
		System.out.println();

		System.out.println("empty1.hashCode() : " + empty1.hashCode());
		System.out.println("empty2.hashCode() : " + empty2.hashCode());
		System.out.println();

		System.out.println("empty1.getClass() : " + empty1.getClass());
		System.out.println("empty2.getClass() : " + empty2.getClass());
		System.out.println();

		System.out.println("empty1.getClass().getName() : "
							+ empty1.getClass().getName());
		System.out.println("empty2.getClass().getName() : "
							+ empty2.getClass().getName());
		System.out.println();

		System.out.println("empty1.equals(empty2) : "
							+ empty1.equals(empty2));
		System.out.println("empty1 == empty2 : "
							+ (empty1 == empty2));

	}//end of main

}
