class  Parent {
    void up(int k) {}
}
class Child extends Parent {
    void up() {}//overload
}
public class InheritTest {

	public static void main(String[] args) {
        Parent  a = new  Child();
        //a.up();//error - override가 아니다.
	}

}
