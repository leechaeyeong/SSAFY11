import java.util.Scanner;

public class StudentArrayTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student2 [] stuArr = new Student2[30];
		int menuNo = 0, arrNo = 0;
		while(true) {
			System.out.println("메뉴 선택=======");
			System.out.print("0:종료, 1:입력, 3:출력. ");
			menuNo = scan.nextInt();
			if(menuNo == 0){
				System.out.println("bye bye ~~~"); break;
			} else if(menuNo == 1) {
				System.out.println("학생 정보 입력=======");
				System.out.print("이름 : ");
				scan.nextInt();
				String tmpNm = scan.nextLine();
				System.out.print("학번 : ");
				String tmpSn = scan.nextLine();
				System.out.print("전화번호 : ");
				String tmpPn = scan.nextLine();
				System.out.print("나이 : ");
				int tmpAge = scan.nextInt();
				stuArr[arrNo++]
					= new Student2(tmpNm, tmpSn, tmpAge, tmpPn);
			} else if(menuNo == 3) {
				System.out.println("학생 정보 출력=======");
				for(int a=0; a<arrNo; a++) {
					stuArr[a].print();
				}
			}
		}//while
	}//main

}
