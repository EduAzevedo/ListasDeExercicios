package Notas;

public class Result {
    public String nome;
    public double n1, n2, n3;

    public double soma() {
        return n1 + n2 + n3;
    }

    public double pontosRestantes() {
        if (soma() < 60.0) {
            return 60.0 - soma();
        } else {
            return 0.0;
        }
    }

    public String toString() {
        if (soma() > 60.0) {
            return "Nome: " + nome + "\nResultado final: " + soma() + "\nPASS";
        } else {
            return "Nome: " + nome + "\nResultado final: " + soma() + "\nFAILED" + "\nPontos restantes: "
                    + pontosRestantes();
        }

    }
}
