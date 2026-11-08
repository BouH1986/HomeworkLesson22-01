package AlgHW03;

public class Merges {
    /**
     * Метод для слияния всех команд в одну национальную
     */
    public static int[] mergeAll(int[][] teams) {
        // Ваш код
        int[] res = new int[teams[teams.length - 1].length];
        for (int i = 0; i < teams.length; i++) {
            res = merge(res, teams[i]);
        }
        System.out.println();
        return res;
    }

    /**
     * Метод для слияния двух команд в одну
     */
    public static int[] merge(int[] teamA, int[] teamB) {
        // Ваш код
        int[] merged = new int[teamA.length];
        int ia = 0;
        int ib = 0;
        int ic = 0;
        while (ic < teamA.length) {
            if (teamA[ia] > teamB[ib]) {
                merged[ic] = teamA[ia];
                ia++;
            } else {
                merged[ic] = teamB[ib];
                ib++;
            }
            ic++;
        }
        return merged;
    }
}