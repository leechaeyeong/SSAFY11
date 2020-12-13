class 포유류 {}
class 사람 extends 포유류 implements FunctionWalk {
	@Override
	public void walk() {
	}
}
class 파충류{}
class 도마뱀 extends 파충류 implements FunctionWalk {
	@Override
	public void walk() {
	}
}
interface FunctionWalk {
	public void walk();
}
/*
 * interface의 또 다른 장점 : 연관성이 없는 class들에게 연관성 부여.
 * - Heterogeneous Collection, Polymorpic arguments를 사용 가능하게 함.
 * - Polymorphism 개념 적용 가능.
 */
public class Interface4Poly {
	public static void main(String[] args) {
		포유류 [] p = new 포유류[3];
		//p[0] = new 도마뱀();//error - 상속 관계가 없음.
		FunctionWalk [] fw = new FunctionWalk[2];
		fw[0] = new 사람();
		fw[1] = new 도마뱀();
	}
}
