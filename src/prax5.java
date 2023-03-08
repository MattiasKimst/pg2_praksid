import java.util.Arrays;

public class prax5 {
    /**
     *
     * @param maatriks sisend n*m maatriks
     * @param i kustutavaa rea number
     * @param j kustutatava veeru number
     * @return maatriks, kust on kustutatud i-rida ja j-veerg
     */
    public static int[][] ül51(int[][] maatriks, int i, int j){

        int[][] uusMaatriks;
        int uusRida=0;
        int uusVeerg=0;
        uusMaatriks=new int[maatriks.length-1][maatriks[0].length-1];
        for (int rida = 0; rida < maatriks.length; rida++) {
            if (rida==i){
                continue;
            }
            else{
            for (int veerg = 0; veerg < maatriks[0].length; veerg++) {
                if (veerg == j) {
                    continue;
                } else {
                    uusMaatriks[uusRida][uusVeerg++] = maatriks[rida][veerg];
                }
            }
            uusRida++;
            uusVeerg=0;

            }

        }

        return uusMaatriks;
    }

    /**
     *
     * @param sisendMaatriks
     * @return maatriks,mille iga element on asendatud tema naabrite summaga
     */

    public static int[][] ül56(int[][] sisendMaatriks){
        int[][] uusMaatriks=new int[sisendMaatriks.length][sisendMaatriks[0].length];
        int naabriteSumma;
        for (int rida = 0; rida < sisendMaatriks.length; rida++) {
            for (int veerg = 0; veerg < sisendMaatriks[0].length; veerg++) {
                naabriteSumma=0;
                if (rida>0){// ülemine naaber
                    naabriteSumma+=sisendMaatriks[rida-1][veerg];
                }
                if (rida<sisendMaatriks.length-1){// alumine naaber
                    naabriteSumma+=sisendMaatriks[rida+1][veerg];
                }
                if (veerg>0){// vasak naaber
                    naabriteSumma+=sisendMaatriks[rida][veerg-1];
                }
                if (veerg<sisendMaatriks[0].length-1){// vasak naaber
                    naabriteSumma+=sisendMaatriks[rida][veerg+1];
                }
                uusMaatriks[rida][veerg]=naabriteSumma;


            }

        }
        return uusMaatriks;
    }

    public static void main(String[] args) {
       int[][] maatriks=(ül51(new int[][]{{1,2,3},{1,2,3},{1,2,3}},1,2));
        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[0].length; j++) {
                System.out.println(maatriks[i][j]);

            }

        }
        int[][]maatriks2 = (ül56(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));

        for (int i = 0; i < maatriks2.length; i++) {
            for (int j = 0; j < maatriks2[0].length; j++) {
                System.out.println(maatriks2[i][j]);

            }}


    }
}
