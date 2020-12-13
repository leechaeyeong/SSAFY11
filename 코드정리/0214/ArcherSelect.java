import java.util.Arrays;
//캐슬디펜스 조합 예
public class archerSelect {

	public static void main(String[] args) {
		archerSelectByFor();
		System.out.println("=================");
		archerSelectByRecursive(0, new int[3], 0, 0);
		System.out.println("=================");
	}//main
    private static int[] src = {0,1,2,3,4};
	public static void archerSelectByFor() {
        for (int i = 0; i < src.length; i++) {
            for (int j = i + 1; j < src.length; j++) {
                for (int k = j + 1; k < src.length; k++) {
                    System.out.println(src[i] + "," + src[j] + "," + src[k]);
                }
            }
        }
    }//archerSelectByFor
	public static void archerSelectByRecursive(int archerCnt, int[] allArchers, int archerPoint, int selectInt) {
        if (archerCnt == 3) {
        	System.out.println(Arrays.toString(allArchers));
            return;
        }
        for (int i = selectInt; i < 5; i++) {
        	allArchers[archerPoint] = i;
        	archerSelectByRecursive(archerCnt + 1, allArchers, archerPoint + 1, i + 1);
        }
    }//archerSelectByRecursive
}//class
