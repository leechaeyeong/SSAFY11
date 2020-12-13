import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Address {
	String name;//이름
	String group;//소속
	String telRep;//전번 대표
	String telHome;//전번 집
	String telCompany;//전번 회사
	String email;//이메일
	Address(String nm, String grp, String tel1, String tel2, String tel3, String mail){
		this.name = nm;
		this.group = grp;
		this.telRep = tel1;
		this.telHome = tel2;
		this.telCompany = tel3;
		this.email = mail;
	}
	@Override
	public String toString() {
		return "이름 : "+name+"\t"+"소속 : "+group+"\t"+"대표전화 : "+telRep+"\t"
				+"집전화 : "+telHome+"\t"+"회사전화 : "+telCompany+"\t"+"이메일 : "+email;
	}//toString
}
public class Collection7Address {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Address> map = new HashMap<String, Address>();
		int menuNo = 0;
		String tmpName, tmpGrp, tmpTel1, tmpTel2, tmpTel3, tmpEmail;
		System.out.print("0:종료 및 출력, 1:입력.");
		while((menuNo = scan.nextInt()) != 0) {
			System.out.print("이름 : ");
			tmpName = scan.next();
			System.out.print("소속 : ");
			tmpGrp = scan.next();
			System.out.print("대표전화 : ");
			tmpTel1 = scan.next();
			System.out.print("집전화 : ");
			tmpTel2 = scan.next();
			System.out.print("회사전화 : ");
			tmpTel3 = scan.next();
			System.out.print("이메일 : ");
			tmpEmail = scan.next();
			map.put(tmpName, new Address(tmpName, tmpGrp, tmpTel1, tmpTel2, tmpTel3, tmpEmail));
			System.out.print("0:종료 및 출력, 1:입력.");
		}//while
		//2.출력
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}//while
	}//main

}//class




