import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * try문에서 자원을 자동 해제하는 방법.(자바7부터 사용.)
 * - implements AutoCloseable ->  @Override close()
 */
class AutoCloseTest implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("자동 자원 해제...");
	}
}
class AutoCloseTest2 implements AutoCloseable {
	FileReader fr;
	@Override
	public void close() throws IOException {
		System.out.println("자동 자원 해제...");
		//fr.close();
	}
}
public class Exception8Resources {
	public static void main(String[] args) {
		try(AutoCloseTest2 at2 = new AutoCloseTest2()) {
			//at2.fr = new FileReader("aaa.txt");
		} catch (IOException e) {
			System.out.println("IOException 처리...");
			//e.printStackTrace();
		}
//		try(AutoCloseTest at = new AutoCloseTest()){
//			throw new FileNotFoundException();
//		} catch(Exception e) {
//			System.out.println("Exception 처리...");
//		}

	}//main

}


