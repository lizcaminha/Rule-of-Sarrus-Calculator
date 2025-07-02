import java.util.Random;
public class javadia2 {
    public static void main (String[] args){
        Random randint = new Random();
        int[][] matriza = new int[3][3];
        int determinantePrincipal=1, determinanteSecundaria=1, contador=0, somaDiag1=0, somaDiag2 = 0, determinante = 0;
        //população da matriz
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriza[i][j] = randint.nextInt(10);
            }
        }
        //soma das diagonais!
        for(i=0; i<3; i++){
             int somaDiagonalPrincipal =+ matriza[i][i];
             int somaDiagonalSecundaria =+ matriza[i][2-i];
        }
        for(i=0; i<=9; i++){
            determinantePrincipal=matriza[contador][i]*determinantePrincipal;
            determinanteSecundaria = matriza[contador][2-i]*determinanteSecundaria;
            if(contador%3==0){
                contador=0+(contador/3);
                somaDiag1 = determinantePrincipal + somaDiag1;
                somaDiag2 = determinanteSecundaria - somaDiag2;
            }
            contador++;
        }
        determinante = somaDiag1 - somaDiag2;
         for (int i = 0; i < 3; i++){
            System.out.println("\n");
            for(int j = 0; j < 3; j++){
                System.out.println(matriza[i][j] + " ");
            }
        }
        System.out.println("Determinante: " + determinante);
    }
}
