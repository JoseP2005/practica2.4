package palabras;

public class CalculadoraDistancias {

    /**
     * Calcula la distancia de edición, tal y como la expone
     * Jurafsky entre las cadenas `s1` y `s2`.
     */
    public static int calcularDistancia(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= s2.length(); j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i][j-1],(dp[i-1][j]));
                    dp[i][j] = Math.min(dp[i][j], 2 + dp[i-1][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}