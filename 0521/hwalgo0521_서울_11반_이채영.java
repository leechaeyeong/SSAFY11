package 백준;

import java.util.Scanner;

public class hwalgo0521_서울_11반_이채영 {
	
		static int n, k;
	    static boolean[][] word;
	    static boolean[] visit;
	    static int res; // 결과
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt(); 
	        k = sc.nextInt(); 
	        word = new boolean[n][26];
	        visit = new boolean[26];
	        
	        for (int i = 0; i < n; i++) {
	            String str = sc.next();
	            for (int j = 0; j < str.length(); j++) {
	                word[i][str.charAt(j)- 'a'] = true;
	            }
	        }
	        //
	        res = 0;
	        search(0, 0);
	        System.out.println(res);
	    }//end of main
	    private static void check() {
	        int maxres = 0;
	        boolean ch = true;
	        
	        for (int k = 0; k < n; k++) {
	            ch = true;
	            for (int i = 0; i < 26; i++) {
	                if (!visit[i] && word[k][i]) {
	                    ch = false;
	                    break;
	                }
	            }
	            if (ch) maxres++;
	        }
	        res = Math.max(maxres, res);
	    }//end of check
	    
	    private static void search(int depth, int index) {
	        if (depth == k) {
	            check();
	            return;
	        }
	        for (int i = index; i < 26; i++) {
	            if (!visit[i]) {
	                visit[i] = true;
	                search(depth + 1, i);
	                visit[i] = false;
	            }
	        }
	    }//end of search
}//end of class
