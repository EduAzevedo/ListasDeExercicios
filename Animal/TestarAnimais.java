package Animal;

import java.util.Scanner;

public class TestarAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu();
        System.out.println("Digite a opção: ");
        int opcao = sc.nextInt();

        switch(opcao) {
        case 1:
        System.out.println("Insira o nome, cor, número de patas, ambiente, comprimento, velocidade e  alimento: ");
        Mamifero camelo = new Mamifero(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
        camelo.dadosMamifero();
        break;

        case 2:
        System.out.println("Insira o nome, comprimento, número de patas, cor, ambiente, velocidade, alimento e as caracteristicas: ");
        Peixe tubarao = new Peixe(sc.next(), sc.nextDouble(), sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.nextLine());
        tubarao.dadosPeixe();
        break;

        case 3:
        System.out.println("Insira o nome, cor, número de patas, ambiente, comprimento, velocidade e  alimento: ");
        Mamifero ursocanada = new Mamifero(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
        ursocanada.dadosMamifero();
        break;

        default:
        System.out.println("<<Finalizando>>");
        break;

        }

        sc.close();
    }

    public static void Menu() {
        String textblock = """
                           1- Camelo
                           2- Tubarão
                           3- Urso
                           Sair
                           """;
        System.out.println(textblock);
    }
}