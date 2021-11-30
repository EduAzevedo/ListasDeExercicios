package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregados> list = new ArrayList<>();

        System.out.println("Quantos funcionarios serão adicionados?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Empregado #" + (i + 1) + ": ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            Empregados emp = new Empregados(id, nome, salario);

            list.add(emp);
        }
        // Incremento de salario
        System.out.println("\nID para ter salário incrementado: ");
        int idSalary = sc.nextInt();
        Integer pos = searchId(list, idSalary);
        if (pos != null) {
            System.out.println("Porcentagem a ser incrementada: ");
            double percentage = sc.nextDouble();
            list.get(pos).aumentarSalario(percentage);

        } else {
            System.out.println("\nID não encontrado!");
        }

        System.out.println("\nLista de empregados: ");
        for (Empregados emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer searchId(List<Empregados> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
