import java.util.ArrayList;
import java.util.List;
//게리맨더링 비트를 사용한 조합 예
public class BitTest {
	public static void main(String[] args) {
		for (int a = 1; a < Math.pow(2,5); a++) {
            List<Integer> group1 = new ArrayList<>();
            List<Integer> group2 = new ArrayList<>();
            for (int b = 0; b < 6; b++) {
            	System.out.println(a+", "+b+" : (1 << j)"+" : "+(a & 1 << b));
            	System.out.println(a+", "+b+" : (i & 1 << j)"+" : "+(a & 1 << b));
            	if ((a & 1 << b)>0) {
            		group1.add(b);
                } else {
                	group2.add(b);
                }
            }
            System.out.println("그룹 결과: " + group1 + ", " + group2);
		}
	}
}
