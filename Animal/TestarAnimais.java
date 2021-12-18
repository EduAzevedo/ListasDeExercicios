package Animal;

import java.util.Scanner;

public class TestarAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, cor, ambiente, alimento;
        Long caracteristicas;
        Double comprimento, velocidade;
        int Nr_patas;
        Menu();
        System.out.println("Digite a opção: ");
        int opcao = sc.nextInt();


        switch(opcao) {
        case 1:
        System.out.println("Insira o nome: ");
        nome = sc.next();
        System.out.println("Insira a comprimento: ");
        comprimento = sc.nextDouble();
        System.out.println("Insira o numero de patas: ");
        Nr_patas= sc.nextInt();
        System.out.println("Insira a cor: ");
        cor = sc.next();
        System.out.println("Insira o ambiente: ");
        ambiente = sc.next();
        System.out.println("Insira a velocidade: ");
        velocidade = sc.nextDouble();
        System.out.println("Insira o alimento: ");
        alimento = sc.next();
        Mamifero camelo = new Mamifero(alimento, nome, comprimento, Nr_patas, cor, velocidade, ambiente);
        camelo.dadosMamifero();
        break;

        case 2:
        System.out.println("Insira o nome: ");
        nome = sc.next();
        System.out.println("Insira a comprimento: ");
        comprimento = sc.nextDouble();
        System.out.println("Insira o numero de patas: ");
        Nr_patas= sc.nextInt();
        System.out.println("Insira a cor: ");
        cor = sc.next();
        System.out.println("Insira o ambiente: ");
        ambiente = sc.next();
        System.out.println("Insira a velocidade: ");
        velocidade = sc.nextDouble();
        System.out.println("Insira o alimento: ");
        alimento = sc.next();
        System.out.println("Insira as caracteristicas: ");
        caracteristicas = sc.nextLong();
        Peixe tubarao = new Peixe(caracteristicas, nome, comprimento, Nr_patas, cor, velocidade, ambiente);
        tubarao.dadosPeixe();
        break;

        case 3:
        System.out.println("Insira o nome: ");
        nome = sc.next();
        System.out.println("Insira a comprimento: ");
        comprimento = sc.nextDouble();
        System.out.println("Insira o numero de patas: ");
        Nr_patas= sc.nextInt();
        System.out.println("Insira a cor: ");
        cor = sc.next();
        System.out.println("Insira o ambiente: ");
        ambiente = sc.next();
        System.out.println("Insira a velocidade: ");
        velocidade = sc.nextDouble();
        System.out.println("Insira o alimento: ");
        alimento = sc.next();
        Mamifero ursocanada = new Mamifero(alimento, nome, comprimento, Nr_patas, cor, velocidade, ambiente);
        ursocanada.dadosMamifero();
        break;

        default:
        System.out.println("<<Finalizando>>");
        break;

        }

        sc.close();
    }

    public static String Menu() {
        return "1-Camelo\n2-Tubarão\n3-Urso Canadá";
    }
}