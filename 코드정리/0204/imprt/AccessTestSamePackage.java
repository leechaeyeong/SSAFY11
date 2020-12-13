package test.imprt;

public class AccessTestSamePackage {

	public static void main(String[] args) {
		//2. same package
		AccessData ad = new AccessData();
		System.out.println(ad.puStr);
		System.out.println(ad.proStr);
		System.out.println(ad.deStr);
		//System.out.println(ad.priStr);
		//private : 같은 class 내부에서만 접근 가능. 다른 class에서는 접근 불가.
	}

}
