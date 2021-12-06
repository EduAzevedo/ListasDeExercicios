package Notas;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result resultado = new Result();
        System.out.println("Insira o nome do aluno: ");
        resultado.nome = sc.nextLine();
        System.out.println("Insira as 3 notas: ");
        resultado.n1 = sc.nextDouble();
        resultado.n2 = sc.nextDouble();
        resultado.n3 = sc.nextDouble();

        System.out.println(resultado);
        sc.close();
    }
}