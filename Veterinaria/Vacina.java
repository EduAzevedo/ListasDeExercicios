package Veterinaria;

public class Vacina {
    private String nome, lote, dataVencimento;

    public Vacina(String nome, String lote, String dataVencimento) {
        this.nome = nome;
        this.lote = lote;
        this.dataVencimento = dataVencimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLote() {
        return this.lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String toString() {
        return "Nome: "+ this.nome
               +"\nLote: "+ this.lote
               +"\nData de vencimento: "+ this.dataVencimento;
    }

}