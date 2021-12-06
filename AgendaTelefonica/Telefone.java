package AgendaTelefonica;

public class Telefone {
    public String numero, marcador;

    public Telefone() {

    }

    public Telefone(String numero, String marcador) {
        this.numero = numero;
        this.marcador = marcador;
    }

    public String toString() {
        return "Telefone: " + numero
                + marcador;
    }

}
