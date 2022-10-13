//2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
//0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
//qual é o maior e o menor valor da coluna 7.

import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matrizM = new int[10][10];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = random.nextInt(10);
                System.out.print("__"+ matrizM[i][j] +"__|");

            }
            System.out.println();
        }

        int maior5 = 0;
        int menor5 = 10;
        int maior7 = 0;
        int menor7 = 10;

        for (int i = 0; i < matrizM[5].length; i++) {
            if (matrizM[5][i] > maior5) {
                maior5 = matrizM[5][i];
            }
            if (matrizM[5][i] < menor5) {
                menor5 = matrizM[5][i];
            }
            for (int j = 0; j < matrizM[7].length; j++) {
                if (matrizM[7][i] > maior7) {
                    maior7 = matrizM[7][i];
                }
                if (matrizM[7][i] < menor7) {
                    menor7 = matrizM[7][i];

                }
            }
        }
        System.out.println();
        System.out.println("O maior valor da linha 5 é: " + maior5);
        System.out.println("O menor valor da linha 5 é: " + menor5);
        System.out.println();
        System.out.println("O maior valor da coluna 7 é: " + maior7);
        System.out.println("O menor valor da coluna 7 é: " + menor7);
    }
}