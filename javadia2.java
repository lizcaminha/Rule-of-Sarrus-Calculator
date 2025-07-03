import java.util.Random;
public class javadia2 {
    public static void main (String[] args){
        Random randint = new Random();
        int[][] matriza = new int[3][3];
        int determinantePrincipal=1, determinanteSecundaria=1, contador=0, somaDiag1=0, somaDiag2 = 0, determinante = 0, i, j, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
        //população da matriz
        for (i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                matriza[i][j] = randint.nextInt(10);
            }
        }
        //soma das diagonais!
        for(i=0; i<3; i++){
             somaDiagonalPrincipal =+ matriza[i][i];
             somaDiagonalSecundaria =+ matriza[i][2-i];
        }
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(contador==3){
                    if(j==0){
                        contador=i;
                    }else{
                        contador=0;
                    }
                    somaDiag1 = determinantePrincipal + somaDiag1;
                    somaDiag2 = determinanteSecundaria - somaDiag2;
                }
                determinantePrincipal=matriza[contador][j]*determinantePrincipal;
                determinanteSecundaria = matriza[contador][2-j]*determinanteSecundaria;

                contador++;
            }
        }
        determinante = somaDiag1 - somaDiag2;
         for (i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(matriza[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Determinante: " + determinante +"\nSoma da Diagonal Principal: " + somaDiagonalPrincipal +"\nSoma da Diagonal Secundaria: " + somaDiagonalSecundaria);
    }
}
