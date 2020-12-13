/*
 * IO : InputStream & OutputStream
 * - Stream : data의 이동을 의미.
 * - Input : 외부에서 myProgram으로 data 이동.
 * - Output : myProgram에서 외부로 data 이동.
 * - node(기반) : data source와 destination을 연결하는 기능.
 *               예)FileInputStream, FileOutputStream
 * - filter(조작) : data 가공 또는 용이한 접근을 제공.
 *                 예) InputStreamReader, OutputStreamWriter(8bit -> 16bit 변환)
 * - byte(8bit) : 입출력 단위가 8bit. 비영어권 문자 표현에 제약있음.
 *                class name이 InputStream, OutputStream으로 끝남.
 * - char(16bit) : 입출력 단위가 16bit. 비영어권 문자 표현 가능.
 *                 class name이 Reader, Writer으로 끝남.
 * - Stream의 조합 시, 주의 사항. : Reader는 Reader끼리, InputStream은 InputStream끼리.
 *                            Writer는 Writer끼리, OutputStream은 OutputStream끼리.
 * - 주의!!! : 생성한 IO 객체는 반드시 close() 해야 함!!!
 *            close() 할 때는 생성의 역순으로!!!
 * - flush() : Writer와 OutputStream에서 data 강제 밀어내기.
 */
public class IO1OverView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
