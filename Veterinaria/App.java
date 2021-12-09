package Veterinaria;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "null", raca = "null", cor = "null";
        char sexo = 'X';
        int option;
        Clinica clinica = new Clinica();
        
        do {
            Menu();
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Insira o nome, lote e data de vencimento da vacina: ");
                    Vacina vac = new Vacina(sc.next(), sc.next(), sc.next());
                    System.out.println("Dados da vacina:\n" + vac.toString());
                    clinica.addVacina(vac);
                    break;

                case 2:
                    Cachorro dog = new Cachorro(nome, raca, cor, sexo);
                    System.out.println("Insira o nome, raça, cor e sexo(m/f): ");
                    dog.setNome(sc.next());
                    dog.setRaca(sc.next());
                    dog.setCor(sc.next());
                    dog.setSexo(sc.next().charAt(0));
                    System.out.println("Dados:\n" + dog.toString());
                    clinica.addCachorro(dog);
                    break;

                case 3:
                    System.out.println("Insira o nome do cachorro: ");
                    nome = sc.next();
                    Cachorro dog2 = clinica.pesquisaCachorro(nome);
                    System.out.println(dog2.toString());
                    System.out.println("Nome da vacina: ");
                    clinica.buscarVacina(sc.next());
                    System.out.println();

                case 4:
                    System.out.println("<<Finalizando>>");
                    break;

                default:
                    System.out.println("Opção inválida. Tente Novamente!");
                    break;

            }

        } while (option != 4);

        sc.close();
    }

    public static void Menu() {
        String textBlock = """
                1. Cadastrar uma vacina
                2. Cadastrar um cachorro
                3. Aplicar uma vacina a um cachorro
                4. Sair
                """;
        System.out.println(textBlock);
    }
}
