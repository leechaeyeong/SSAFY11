import java.util.Scanner;

public class PersonArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person pArr [] = new Person[100];
		int menuNo=0, pArrCnt=0;
		while(true) {
			System.out.println("메뉴 선택=======");
			System.out.print("0:종료, 1:입력, 2:검색, 3:출력. ");
			menuNo = scan.nextInt();
			if(menuNo == 0){
				System.out.println("bye bye ~~~"); break;
			} else if(menuNo == 1) {
				pArrCnt = input(scan, pArr, pArrCnt);
			} else if(menuNo == 2) {
				search(scan, pArr, pArrCnt);
			} else if(menuNo == 3) {
				output(pArr, pArrCnt);
			} else {
				System.out.println("wrong input !!! try again !!!");
			}
		}//while
	}//main
	public static int input(Scanner scan, Person[] pArr, int pArrCnt) {
		int subMenuNo=0;
		System.out.print("1:Student, 2:Teacher. ");
		subMenuNo = scan.nextInt();
		System.out.print("이름 : ");
		String tmpNm = scan.next();
		System.out.println(tmpNm);
		System.out.print("주민번호 : "); String tmpSn = scan.next();
		System.out.print("전화번호 : "); String tmpPn = scan.next();
		System.out.print("주소 : "); String tmpAd = scan.next();
		if(subMenuNo == 1) {
			System.out.print("학번 : "); String tmpHb = scan.next();
			System.out.print("소속학년반 : "); String tmpCr = scan.next();
			pArr[pArrCnt] = new Student(tmpNm,tmpSn,tmpPn,tmpAd,tmpHb,tmpCr);
		} else if(subMenuNo == 2) {
			System.out.print("담당과목 : "); String tmpSj = scan.next();
			System.out.print("담당학년반 : "); String tmpCr = scan.next();
			pArr[pArrCnt] = new Teacher(tmpNm,tmpSn,tmpPn,tmpAd,tmpSj,tmpCr);
		} else {
			System.out.println("wrong input !!! try again !!!");
		}
		return ++pArrCnt;
	}//input
	public static void search(Scanner scan, Person[] pArr, int pArrCnt) {
		int subMenuNo=0;
		System.out.print("1:학생학번, 2:교수과목. ");
		subMenuNo = scan.nextInt();
		if(subMenuNo == 1) {
			System.out.print("학생학번입력 : ");
			String tmpHb = scan.next();
			for(int i=0; i<pArrCnt; i++) {
				if(pArr[i] instanceof Student){
					Student tmpS = (Student) pArr[i];
					if(tmpS.hakbun.equals(tmpHb)) {
						tmpS.print();
					}
				}
			}
		} else if(subMenuNo == 2) {
			System.out.print("교수과목입력 : ");
			String tmpSj = scan.next();
			for(int i=0; i<pArrCnt; i++) {
				if(pArr[i] instanceof Teacher){
					Teacher tmpT = (Teacher) pArr[i];
					if(tmpT.subject.equals(tmpT)) {
						tmpT.print();
					}
				}
			}
		}else {
			System.out.println("wrong input !!! try again !!!");
		}
	}//search
	public static void output(Person[] pArr, int pArrCnt) {
		for(int i=0; i<pArrCnt; i++) {
			System.out.println("=====================");
			pArr[i].print();
		}
	}//output
}//class



