import java.util.Scanner;
//계산기
public class If1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int firstInt = scan.nextInt();
		System.out.print("숫자 입력 : ");
		int secondInt = scan.nextInt();
		System.out.print("연산 부호 + - * / 입력 : ");
		char giho = scan.next().charAt(0);
		//if문을 사용하여 연산 결과를 출력하라.
		if(giho == '+') {
			System.out.println(firstInt + secondInt);
		}else if(giho == '-') {
			System.out.println(firstInt - secondInt);
		}else if(giho == '*') {
			System.out.println(firstInt * secondInt);
		}else if(giho == '/') {
			System.out.println(firstInt / secondInt);
		}else {
			System.out.println("error");
		}

	}

}
