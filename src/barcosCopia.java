public class barcosCopia {
    public static void main(String[]args){
        int[][] tablero;
        tablero=new int[][]{
                {4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,0,0,2},
                {0,1,0,0,0}
        };

        recorrerTablero(tablero);
    }

    /**
     * Funcion que revisa un tablero
     * @param aux_tablero tablero a revisar
     */
    private static void recorrerTablero(int[][] aux_tablero) {
        for (int i=0;i<aux_tablero.length;i++){
            for (int j=0;j<aux_tablero[i].length;j++){
                mostrarNave(i,j,aux_tablero);
            }
        }
    }

    /**
     * Funcion que revisa si en la posicion hay o no un barco y que tipo de barco es
     * @param i fila para saber la posicion
     * @param j columna para saber la posicion
     * @param auxTablero tablero
     */
    private static void mostrarNave(int i, int j, int[][] auxTablero) {
        if (auxTablero[i][j]!=0){
            switch (auxTablero[i][j]){
                case 1:
                    System.out.println("Submarino "+i+":"+j);
                    break;

                case 2:
                    System.out.println("Acorazado "+i+":"+j);
                    break;

                case 4:
                    System.out.println("Portaaviones "+i+":"+j);
                    break;

                default:
                    System.out.println("No sé lo que es");
                    break;
            }
        }
    }

}
