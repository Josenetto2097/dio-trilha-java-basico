package org.debuggingg;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Jose" , "Maisa" , "Camila" , "Bruno"};

        double media = calculaMediadaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f ", media);
    }

        public static double calculaMediadaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos){
             System.out.printf("Nota o aluno %s: " , aluno);
             double nota = scanner.nextDouble();
             soma += nota;
        }

        return soma / alunos.length;
    }
}
