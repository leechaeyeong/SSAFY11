
class Company{
	private static Company com = new Company();
	private Company() {}//1.외부 생성을 막는다.
	public static Company getCompany() {
		return com;
	}
}//class
public class Static5Singleton {

	public static void main(String[] args) {
		Company c3 = Company.getCompany();
		Company c4 = Company.getCompany();
		System.out.println(c3 == c4);
//		Company c1 = new Company();//error
//		Company c2 = new Company();//error
//		System.out.println(c1 == c2);
	}

}
