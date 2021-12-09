package Veterinaria;

public class Cachorro {
    private String nome, raca, cor;
    private char sexo;

    public Cachorro(String nome, String raca, String cor, char sexo) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
    }

    public Cachorro(String nome, String raca, String cor, char sexo, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.sexo = sexo;
    }

    public boolean addVacina(Vacina obj) {
        boolean flag = false;

        return flag;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return "Nome: " + this.nome +
                "\nRaça: " + this.raca +
                "\nCor: " + this.cor +
                "\nSexo: " + this.sexo;
    }
}