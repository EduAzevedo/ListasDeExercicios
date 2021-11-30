package Hotel;

import java.util.Scanner;

public class Quartos {
    public static void main(String[] args) {
        Alunos quartos[] = new Alunos[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            if(quartos[i] == null) {
                System.out.println("\nAluno "+ (i+1) + "\nNúmero do quarto, nome e E-mail: ");
                int quarto = sc.nextInt();
                sc.nextLine();
                quartos[quarto] = new Alunos(sc.next(), sc.next(), quarto);
            }
        }

        System.out.println("\nDados: ");
        for(int i=0; i<quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i].quarto +": "+quartos[i].nome +", "+ quartos[i].email);
            }
        }
        sc.close();
    }
    
}
