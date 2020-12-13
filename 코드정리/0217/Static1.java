
public class Static1 {
	String nonS = new String("non static string");
	static String staticStr = new String("static string");
	public static void staticM() {}
	public void nonStaticM() {}
	public static void main(String[] args) {
		System.out.println(staticStr);
		staticM();
		//nonStaticM()//error - main은 메모리 확보했음. nonS변수는 메모리를 못받았음.
		//System.out.println(nonS);//error - main은 메모리 확보했음. nonS변수는 메모리를 못받았음.
		Static1 s1 = new Static1();//non static 영역을 메모리 할당하는 작업.
		System.out.println(s1.nonS);//객체참조변수s1.으로 접근.
		s1.nonStaticM();
	}

}
