package desafios;

import java.util.Scanner;

public class AreaDireitaMatriz {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        int D = 0, cont = 1;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 11; i > 6; i--) {
            for (int j = cont; j < i; j++, D++)
            { soma += M[j][i];}
            cont++;
        }


        if(O == 'S'){
            System.out.println(soma);}
        else { soma/=D;
            System.out.println(String.format("%.1f", soma));}


    }

}
