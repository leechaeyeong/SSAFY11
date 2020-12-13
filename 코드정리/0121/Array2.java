
public class Array2 {

	public static void main(String[] args) {

		char [] chArr = {'A', 'B', 'C', 'D', 'E'};
		for(int idx=0; idx<chArr.length; idx++) {
			System.out.print(chArr[idx]);
		}//for
		System.out.println();

		for(int i=chArr.length-1; i>=0; i--) {
			System.out.print(chArr[i]);
		}//for
		System.out.println();
	}

}
