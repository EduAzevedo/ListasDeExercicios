package AgendaTelefonica;

public class Contato {
    public String nome, sobrenome, email;
    public Telefone telefones[] = new Telefone[3];

    public Contato(String nome, String sobrenome, Telefone telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefones[0] = telefone;
    }

    public Contato(String nome, String sobrenome, Telefone telefone, String email) {
        this(nome, sobrenome, telefone);
        this.email = email;
    }

    public boolean addTelefone(Telefone telefone) {
        boolean result = false;
        for (int i = 0; i < telefones.length; i++) {
            if (telefones[i] == null) {
                telefones[i] = telefone;
                result = true;
                break;
            } else {
                result = false;
            }
        }
        return result;
    }

    public void alterarEmail(String email) {
        this.email = email;
    }

    public String toString() {
        String print = "Nome: " + nome + " " + sobrenome + "\nE-mail: " + email + "\nTelefones: ";
        for (Telefone vetor : telefones) {
            if (vetor != null) {
                print = print + vetor.toString() + "\n";

            }
        }
        return print;
    }

}