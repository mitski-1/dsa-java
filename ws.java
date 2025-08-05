import java.util.*;
import java.util.Arrays;
import java
public class ws {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
      boolean[][] dp = new boolean[m+1][n+1];
         for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
         }
         for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char pChar = p.charAt(j - 1);
                char sChar = s.charAt(i - 1);
                if (pChar == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (pChar == '?' || pChar == sChar) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        
        return dp[m][n];
    }
        
    }
}