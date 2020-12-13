/*
 * Math Class - 수학 연산 method가 있는 class
 * - 모든 method가 static임으로, 객체 생성(new) 없이 사용 가능
 * abs(절대값 구하기), sin, cos, tan, log, exp
 * ceil(올림), round(반올림), floor(내림)
 * max(두 수 중 큰 값 구하기), min(두 수 중 작은 값 구하기)
 * pow(승 구하기), sqrt(제곱근 구하기), random(무작위 수 구하기)
 */
public class MathTest {

	public static void main(String[] args) {
		System.out.println("Math.ceil(0.1) : " + Math.ceil(0.123456789));
		System.out.println("Math.round(0.4) : " + Math.round(0.4));
		System.out.println("Math.round(0.5) : " + Math.round(0.56789));
		System.out.println("Math.floor(0.9) : " + Math.floor(0.987654321));
		System.out.println("Math.max(100,200) : " + Math.max(100,200));
		System.out.println("Math.min(100,200) : " + Math.min(100,200));
		System.out.println("Math.pow(2,5) : " + Math.pow(2,5));//2의 5승
		System.out.println("Math.sqrt(16) : " + Math.sqrt(16));//16의 제곱근(루트 구하기)
		System.out.println("Math.random() 1 : " + Math.random());
		System.out.println("Math.random() 2 : " + Math.random());
		System.out.println("Math.random() 3 : " + Math.random());
		System.out.println("Math.random() 4 : " + Math.random());
		System.out.println("Math.random() 5 : " + Math.random());
		System.out.println("Math.random() 6 : "
					+ (int)(Math.random() * 45 +1));
	}

}
