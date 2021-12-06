package AgendaTelefonica;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String nome, sobrenome, telefone, marcador, resp;
        int opcao;

        do {
            Menu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome, sobrenome, numero e marcador: ");
                    nome = sc.next();
                    sobrenome = sc.next();
                    telefone = sc.next();
                    marcador = sc.next();
                    Telefone tel = new Telefone(telefone, marcador);
                    Contato ctt = new Contato(nome, sobrenome, tel);
                    agenda.addContato(ctt);
                    do {
                        System.out.println("Inserir mais um numero? S/N");
                        resp = sc.next().toUpperCase();
                        if (resp.charAt(0) == 'S') {
                            System.out.println("Numero: ");
                            telefone = sc.next();
                            System.out.println("Marcador: ");
                            marcador = sc.next();
                            Telefone tel2 = new Telefone(telefone, marcador);
                            if (ctt.addTelefone(tel2)) {
                                System.out.println("Numero inserido!");
                            } else {
                                System.out.println("Não é possível adicionar outro número aqui!");
                            }

                        }

                    } while (resp.charAt(0) == 'S');
                    System.out.println("Adicionar e-mail agora? S/N");
                    resp = sc.next().toUpperCase();
                    if (resp.charAt(0) == 'S') {
                        System.out.println("E-mail: ");
                        ctt.alterarEmail(sc.next());
                    }

                    break;

                case 2:
                    System.out.println("Insira nome e sobrenome para busca: ");
                    nome = sc.next();
                    sobrenome = sc.next();
                    agenda.buscarContato(nome, sobrenome);
                    break;
                case 3:
                    System.out.println("Nome e sobrenome: ");
                    
                    nome = sc.next();
                    sobrenome = sc.next();
                    Contato ctt2 = agenda.buscarContato(nome, sobrenome);

                    System.out.println(ctt2.toString());
                    System.out.println("3.1 - Adicionar/Alterar e-mail \n3.2 - Adicionar telefone");
                    Double subMenu = sc.nextDouble();
                    if (subMenu == 3.1) {
                        System.out.println("Insira o e-mail: ");
                        ctt2.alterarEmail(sc.next());
                        System.out.println("|| E-mail definido com sucesso! ||\n");
                    } else if (subMenu == 3.2) {
                        System.out.println("Numero: ");
                        telefone = sc.next();
                        System.out.println("Marcador: ");
                        marcador = sc.next();
                        Telefone tel2 = new Telefone(telefone, marcador);
                        if (ctt2.addTelefone(tel2)) {
                            System.out.println("Numero inserido!");
                        } else {
                            System.out.println("Não é possível adicionar outro número aqui!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("<<<Finalizando>>>");
                    break;

                default:
                    System.out.println("opção invalida!\n");
                    break;
            }

        } while (opcao != 4);
        sc.close();

    }

    public static void Menu() {
        String textBlock = """
                1. Inserir Contato
                2. Buscar Contato
                3. Alterar Contato
                4. Sair da agenda
                 """;
        System.out.println(textBlock);
    }
}
