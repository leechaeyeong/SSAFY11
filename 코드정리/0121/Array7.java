
public class Array7 {

	public static void main(String[] args) {

		//구구단 -> 이중 배열에 담으시오.
		int gugu [][] = new int[8][9];
		for(int a=0,dan=2; dan<10; a++,dan++) {
			for(int b=0,gop=1; gop<10; b++,gop++) {
				gugu[a][b] = dan * gop;
				System.out.println(dan + "*" + gop + "=" + gugu[a][b]);
			}
		}

	}

}
