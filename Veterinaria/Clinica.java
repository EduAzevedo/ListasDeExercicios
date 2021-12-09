package Veterinaria;

public class Clinica {
    Cachorro cachorros[] = new Cachorro[200];
    Vacina vacinas[] = new Vacina[200];

    public Clinica() {

    }

    public boolean addCachorro(Cachorro dog) {
        boolean flag = false;
        for (int i = 0; i < cachorros.length; i++) {
            if (cachorros[i] == null) {
                cachorros[i] = dog;
                System.out.println("Cachorro adicionado com sucesso!\n");
                flag = true;
                break;
            } else {
                System.out.println("Não foi possível adicionar o cachorro!\n");
            }
        }
        return flag;
    }

    public boolean addVacina(Vacina vacina) {
        boolean flag = false;
        for (int i = 0; i < vacinas.length; i++) {
            if (vacinas[i] == null) {
                vacinas[i] = vacina;
                flag = true;
                System.out.println("Vacina adicionada com sucesso!\n");
                break;
            } else {
                System.out.println("Não foi possível adicionar a vacina!\n");
            }
        }
        return flag;
    }

    public Cachorro pesquisaCachorro(String nome) {
        Cachorro obj = null;
        for (Cachorro vetor : cachorros) {
            if (vetor != null) {
                if (nome.equalsIgnoreCase(vetor.getNome())) {
                   System.out.println(nome+" foi encontrado, vamos ao próximo passo!");
                    return vetor;
                } else {
                    break;
                }
            }
        }
        return obj;
    }

    public Vacina buscarVacina(String nome) {
        Vacina obj = null;
        for (Vacina vetor : vacinas) {
            if (vetor != null) {
                if (nome.equalsIgnoreCase(vetor.getNome())) {
                    System.out.println("Vacina aplicada!");
                    return vetor;
                } else {
                    break;
                }
            }
        }
        return obj;
    }
}