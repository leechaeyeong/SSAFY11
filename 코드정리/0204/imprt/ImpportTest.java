package test.imprt;
/*
 * import : 현 파일에 필요한 다른 class의 위치를 지정.(다른 class를 가져오라는 의미.)
 * - 상위 폴더에서 하위 폴더 순으로 . 을 통해 접근.
 * - 하나의 파일에 여러 import 선언 가능.
 * - 일반적으로 소문자 사용.
 * 예) import test.pac.PacTestObj : test 폴더 밑에 pac 폴더에 있는 PacTestObj class를 가져와라.
 * - import java.util.* : * 모든 class를 가져오라는 의미. : 비추 !!!
 * - import 에 선언된 class는 classLoader에 로딩된다.
 * - 따라서, 꼭 필요한 class만 import로 지정하는 것을 권장한다.
 */
import test.pac.PacTestObj;

public class ImpportTest {

	public static void main(String[] args) {
		PacTestObj pto = new PacTestObj();
		pto.setMessage("simple package & import test...");
		pto.print();
	}

}
