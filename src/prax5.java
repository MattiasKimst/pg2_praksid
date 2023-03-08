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

    public static void main(String[] args) {
       int[][] maatriks=(ül51(new int[][]{{1,2,3},{1,2,3},{1,2,3}},1,2));
        for (int i = 0; i < maatriks.length; i++) {
            for (int j = 0; j < maatriks[0].length; j++) {
                System.out.println(maatriks[i][j]);

            }

        }


    }
}
